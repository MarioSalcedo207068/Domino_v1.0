
package BlackBoard.KnowledgeSources;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.playerToken;

/**
 *
 * @author Equipo 02
 */
public class CalcularScoreJugadores implements KnowledgeSource
{
    private Game game;
    
        public CalcularScoreJugadores(Game game)
        {
        this.game = game;
        }
        
        public void update()
        {
        int sumaValorFicha = 0;
        List<Dictionary> puntuaciones = null;
        for(Player jugador:game.getPlayers())
          {
            Dictionary<String, Integer> puntuacion= new Hashtable<>();
            List<playerToken> listaFichas = jugador.getAllTokenList();
            for(playerToken ficha:listaFichas)
            {
                sumaValorFicha = ficha.getLowerSide() + ficha.getUpperSide();
            }
            puntuacion.put(jugador.getName(), sumaValorFicha);
            puntuaciones.add(puntuacion);
          }
//      return puntuaciones;  
        }
        
}
