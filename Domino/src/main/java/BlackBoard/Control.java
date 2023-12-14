
package BlackBoard;

import BlackBoard.KnowledgeSources.AsignarFichasAJugador;
import BlackBoard.KnowledgeSources.CalcularScoreJugadores;
import BlackBoard.KnowledgeSources.DevolverFichasAlPozo;
import BlackBoard.KnowledgeSources.InsertarFichaJugadorAlTablero;
import BlackBoard.KnowledgeSources.KnowledgeSource;
import BlackBoard.KnowledgeSources.ObtenerFichaDelPozo;
import BlackBoard.KnowledgeSources.ValidarFichaTablero;
import BlackBoard.KnowledgeSources.VerificarCantidadFichasJugador;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import org.itson.Domain.Estados;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.Token;
import org.itson.Domain.playerToken;


/**
 *
 * @author Equipo 02
 */
public class Control extends java.util.Observable implements Observer
{
    private EstadosControl estado;
    private Game blackboard;
    private List<KnowledgeSource> listaExpertos;
    
    public Control(Game game)
    {
        this.blackboard = game;
        blackboard.addObserver(this);
        listaExpertos = new LinkedList<>();
        AsignarFichasAJugador e1 = new AsignarFichasAJugador(blackboard);
        CalcularScoreJugadores e2 = new CalcularScoreJugadores(blackboard);
        DevolverFichasAlPozo e3 = new DevolverFichasAlPozo(blackboard);
        InsertarFichaJugadorAlTablero e4 = new InsertarFichaJugadorAlTablero(blackboard);
        ValidarFichaTablero e5 = new ValidarFichaTablero(blackboard);
        ObtenerFichaDelPozo e6 = new ObtenerFichaDelPozo(blackboard);
        VerificarCantidadFichasJugador e7 = new VerificarCantidadFichasJugador(blackboard);
        
        listaExpertos.add(e1);
        listaExpertos.add(e2);
        listaExpertos.add(e3);
        listaExpertos.add(e4);
        listaExpertos.add(e5);
        listaExpertos.add(e6);
        listaExpertos.add(e7);
        
        
    }

    public Control() 
    {
        listaExpertos = new LinkedList<>();
        AsignarFichasAJugador e1 = new AsignarFichasAJugador(blackboard);
        CalcularScoreJugadores e2 = new CalcularScoreJugadores(blackboard);
        DevolverFichasAlPozo e3 = new DevolverFichasAlPozo(blackboard);
        InsertarFichaJugadorAlTablero e4 = new InsertarFichaJugadorAlTablero(blackboard);
        ValidarFichaTablero e5 = new ValidarFichaTablero(blackboard);
        ObtenerFichaDelPozo e6 = new ObtenerFichaDelPozo(blackboard);
        VerificarCantidadFichasJugador e7 = new VerificarCantidadFichasJugador(blackboard);
 
        listaExpertos.add(e1);
        listaExpertos.add(e2);
        listaExpertos.add(e3);
        listaExpertos.add(e4);
        listaExpertos.add(e5);
        listaExpertos.add(e6);
        listaExpertos.add(e7);
    }
    
    public void llamadoExpertos(Object a, Object b,int numExperto)
    {
        KnowledgeSource ks;
        switch(numExperto)
        {
            case 0:
            ks = listaExpertos.get(0);
            ks.update(a,b);
            break;
            
            case 1:
                ks = listaExpertos.get(1);
                ks.update(a,b);
            break;
            
            case 2:
                ks = listaExpertos.get(2);
                ks.update(a,b);
            break;
            
            case 3:
                ks = listaExpertos.get(3);
                ks.update(a,b);
            break;
            
            case 4:
                ks = listaExpertos.get(4);
                ks.update(a,b);
            break;
            
            case 5:
                ks = listaExpertos.get(5);
                ks.update(a,b);
            break;
            
            case 6:
                ks = listaExpertos.get(6);
                ks.update(a,b);
            break;
            
        }
    }
    
    public void setGame(Game game)
    {
        this.blackboard = game;
        this.blackboard.addObserver(this);
    }
    
    public Game getGame() {
        return blackboard;
    }


    
    public void actualizacion(Object a) 
    {
        Estados e = blackboard.getEstadoJuego();
        
        switch (e)
        {
            case EN_ESPERA:
            break;
            
            case ASIGNAR_FICHA:
            this.setEstado(EstadosControl.ctrl_ASIGNAR_FICHA);
            this.setChanged();
            this.notifyObservers(blackboard);
            break;
            
            case FICHA_VALIDA:
            Token t = (Token) a;
            Player p = blackboard.searchTokenInPlayer((playerToken) t);
            llamadoExpertos(a,p,3);//InsertarFichaJugadorAlTablero
            break;
            
            case FICHA_INVALIDA:
            this.setEstado(EstadosControl.ctrl_FICHA_INVALIDA);
            this.setChanged();
            this.notifyObservers(blackboard);                
            break;
            
            case PUNTUACIONES_CALCULADO:
            this.setEstado(EstadosControl.ctrl_PUNTUACIONES_CALCULADO);
            this.setChanged();
            this.notifyObservers(blackboard);
            break;
            
            case FICHAS_DEVUELTAS_POZO:
            this.setEstado(EstadosControl.ctrl_FICHAS_DEVUELTAS_POZO);
            this.setChanged();
            this.notifyObservers(blackboard);            
            break;
            
            case FICHAS_INSERTADAS_TABLERO:
            int id = (int) a;
            llamadoExpertos(id,null,6); //VerificarCantidadFichasJugador
            

            break;
            
            case JUGADOR_CON_FICHAS:
            this.setEstado(EstadosControl.ctrl_JUGADOR_CON_FICHAS);
            this.setChanged();
            this.notifyObservers(blackboard);
            break;
            
            case JUGADOR_SIN_FICHAS:
            llamadoExpertos(null,null,1);//CalcularScoreJugadores
            break;
            case JUGADOR_FICHA_POZO:
            this.setEstado(EstadosControl.ctrl_JUGADOR_FICHA_POZO);
            this.setChanged();
            this.notifyObservers(blackboard);            
            break;    
            
        }
    }

    @Override
    public void update(Observable o, Object arg) 
    {
    if (o != null && o instanceof Game) {
        this.setGame((Game) o);
        actualizacion(arg);
        
    } else
    {System.out.println("NO ES UNA INSTANCIA DE JUEGO");}
    
    }

    public Game getBlackboard() {
        return blackboard;
    }

    public void setBlackboard(Game blackboard) {
        this.blackboard = blackboard;
    }

    public EstadosControl getEstado() {
        return estado;
    }

    public void setEstado(EstadosControl estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
