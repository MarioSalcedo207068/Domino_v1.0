
package BlackBoard.KnowledgeSources;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import org.itson.Domain.Estados;
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

        }

    @Override
    public void update(Object t, Object u) 
    {
         int sumaValorFicha = 0;
        List<Dictionary> puntuaciones = null;
        for(Player jugador:game.getPlayers())
          {
            Dictionary<String, Integer> puntuacion= new Hashtable<>();
            List<playerToken> listaFichas = jugador.getTokenList();
            for(playerToken ficha:listaFichas)
            {
                sumaValorFicha = ficha.getLowerSide() + ficha.getUpperSide();
            }
            puntuacion.put(jugador.getName(), sumaValorFicha);
            puntuaciones.add(puntuacion);
          }
        game.setScoreList(puntuaciones);
        game.setEstadoJuego(Estados.PUNTUACIONES_CALCULADO);
        game.setObservableChanged();
        game.notifyObservers();           
    }
        
}
