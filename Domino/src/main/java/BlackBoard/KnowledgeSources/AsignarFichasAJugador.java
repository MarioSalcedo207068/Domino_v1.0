
package BlackBoard.KnowledgeSources;

import java.util.List;
import org.itson.Domain.Estados;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.Token;

import org.itson.Domain.playerToken;

/**
 *
 * @author Equipo 02
 */
public class AsignarFichasAJugador implements KnowledgeSource<Integer,Integer>
{
    
    private Game game;
    public AsignarFichasAJugador(Game game)
    {
        this.game = game;
    }
    
    @Override
    public void update(Integer cantidadFichas, Integer idJugador) 
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
        List<playerToken> tokensToGive = game.giveTokens(cantidadFichas);
        jugadorBuscado.setTokenList(tokensToGive);
        
        game.setEstadoJuego(Estados.ASIGNAR_FICHA);
        game.setObservableChanged();
        game.notifyObservers();             
    }
    
}
