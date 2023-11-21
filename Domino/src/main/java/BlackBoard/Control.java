
package BlackBoard;

import BlackBoard.KnowledgeSources.AsignarFichasAJugador;
import BlackBoard.KnowledgeSources.CalcularScoreJugadores;
import BlackBoard.KnowledgeSources.DevolverFichasAlPozo;
import BlackBoard.KnowledgeSources.InsertarFichaJugadorAlTablero;
import BlackBoard.KnowledgeSources.KnowledgeSource;
import BlackBoard.KnowledgeSources.ValidarFichaTablero;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
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
        
        listaExpertos.add(e1);
        listaExpertos.add(e2);
        listaExpertos.add(e3);
        listaExpertos.add(e4);
        listaExpertos.add(e5);
        
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
            
        }
    }



    @Override
    public void update(Observable o, Object arg) 
    {
        
        System.out.println("OBSERVADOR ACTUALIZADO");
        
    }
    
}
