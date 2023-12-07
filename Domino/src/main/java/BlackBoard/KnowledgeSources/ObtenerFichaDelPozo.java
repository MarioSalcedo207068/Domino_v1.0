/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackBoard.KnowledgeSources;

import org.itson.Domain.Estados;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.Token;
import org.itson.Domain.playerToken;

/**
 *
 * @author PC
 */
public class ObtenerFichaDelPozo implements KnowledgeSource <Integer,Object> 
{
    Game game;
    public ObtenerFichaDelPozo(Game game)
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
        Token tokenToGive = game.getBoard().getPond().pullToken();
        
        jugadorBuscado.getTokenList().add((playerToken) tokenToGive);
        
        game.setEstadoJuego(Estados.JUGADOR_FICHA_POZO);
        game.setObservableChanged();
        game.notifyObservers();             
        
    }
    
}
