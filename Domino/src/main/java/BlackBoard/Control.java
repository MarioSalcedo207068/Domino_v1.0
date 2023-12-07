
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


/**
 *
 * @author Equipo 02
 */
public class Control implements Observer
{
    private Game blackboard;
    private List<KnowledgeSource> listaExpertos;
    
    public Control(Game game)
    {
        this.blackboard = game;
        listaExpertos = new LinkedList<>();
        AsignarFichasAJugador e1 = new AsignarFichasAJugador(game);
        CalcularScoreJugadores e2 = new CalcularScoreJugadores(game);
        DevolverFichasAlPozo e3 = new DevolverFichasAlPozo(game);
        InsertarFichaJugadorAlTablero e4 = new InsertarFichaJugadorAlTablero(game);
        ValidarFichaTablero e5 = new ValidarFichaTablero(game);
        ObtenerFichaDelPozo e6 = new ObtenerFichaDelPozo(game);
        VerificarCantidadFichasJugador e7 = new VerificarCantidadFichasJugador(game);
        
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
    }
    
    public Game getGame() {
        return blackboard;
    }


    
    private void actualizacion(Game juego) 
    {
        setGame(juego);
        Estados e = juego.getEstadoJuego();
        
        switch (e)
        {
            case EN_ESPERA:
            break;
            
            case ASIGNAR_FICHA:
            break;
            
            case FICHA_VALIDA:
            break;
            
            case FICHA_INVALIDA:
            break;
            
            case PUNTUACIONES_CALCULADO:
            break;
            
            case FICHAS_DEVUELTAS_POZO:
            break;
            
            case FICHAS_INSERTADAS_TABLERO:
            break;
             
        }
    }

    @Override
    public void update(Observable o, Object arg) 
    {
        actualizacion((Game) arg);
    }
    
}
