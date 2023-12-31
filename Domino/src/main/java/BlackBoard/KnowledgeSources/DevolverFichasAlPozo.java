
package BlackBoard.KnowledgeSources;

import java.util.List;
import org.itson.Domain.Estados;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.Token;

/**
 *
 * @author Equipo 02
 */
public class DevolverFichasAlPozo implements KnowledgeSource <Integer,Object>
{
    private Game game;
    public DevolverFichasAlPozo(Game game)
    {
        this.game = game;
    }
    


    @Override
    public void update(Integer idJugador, Object u) 
    {
        Player jugadorBuscado = null;
        
        for(int i = 0;i<game.getPlayers().size();i++)
        {
            if(game.getPlayers().get(i).getId() == idJugador)
            {
                jugadorBuscado = game.getPlayers().get(i);
                break;
            }
        }
        
        game.getBoard().getPond().addTokensToPond(jugadorBuscado.getTokenList());
        jugadorBuscado.setListToEmpty();
        
        
        game.setEstadoJuego(Estados.FICHAS_DEVUELTAS_POZO);
        game.setObservableChanged();
        game.notifyObservers();
    }
    
    
    
}
