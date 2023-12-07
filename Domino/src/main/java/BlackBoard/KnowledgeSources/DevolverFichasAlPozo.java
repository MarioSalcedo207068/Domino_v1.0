
package BlackBoard.KnowledgeSources;

import java.util.List;
import org.itson.Domain.Game;
import org.itson.Domain.Token;

/**
 *
 * @author Equipo 02
 */
public class DevolverFichasAlPozo implements KnowledgeSource
{
    private Game game;
    public DevolverFichasAlPozo(Game game)
    {
        this.game = game;
    }    
    
    
//    public void update(List<Token> tokenList)
//    {
//        game.getBoard().getPond().addTokensToPond(tokenList); 
//    }

    //PENDIENTE
    @Override
    public void update(Object t, Object u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
