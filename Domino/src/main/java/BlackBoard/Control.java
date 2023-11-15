
package BlackBoard;

import BlackBoard.KnowledgeSources.AsignarFichasAJugador;
import BlackBoard.KnowledgeSources.CalcularScoreJugadores;
import BlackBoard.KnowledgeSources.DevolverFichasAlPozo;
import BlackBoard.KnowledgeSources.InsertarFichaJugadorAlTablero;
import BlackBoard.KnowledgeSources.KnowledgeSource;
import BlackBoard.KnowledgeSources.ValidarFichaTablero;
import java.util.LinkedList;
import java.util.List;
import org.itson.Domain.Game;

/**
 *
 * @author Equipo 02
 */
public class Control 
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
    
    public void llamadoExpertos(int numExperto)
    {
        KnowledgeSource ks;
        switch(numExperto)
        {
            case 0:
//            ks = listaExpertos.get(0);
//            ks.update();
            break;
        }
    }
    
}
