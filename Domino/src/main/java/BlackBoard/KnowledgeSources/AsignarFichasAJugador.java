
package BlackBoard.KnowledgeSources;

import java.util.List;
import org.itson.Domain.Game;

import org.itson.Domain.playerToken;

/**
 *
 * @author Equipo 02
 */
public class AsignarFichasAJugador implements KnowledgeSource
{
    
    private Game game;
    public AsignarFichasAJugador(Game game)
    {
        this.game = game;
    }

    public void update(List<playerToken> tokenList, int id)
    {
        int posicionJugador = -1;
        for(int i = 0;game.getPlayers().size()>i;i++)
        {
            if(game.getPlayers().get(i).getId() == id)
            {
                posicionJugador = i;
            }
        }
        game.getPlayers().get(posicionJugador).setTokenList(tokenList);        
    }    
    
    //PENDIENTE

    @Override
    public void update(Object t, Object u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
