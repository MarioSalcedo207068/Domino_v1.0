/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackBoard.KnowledgeSources;

import org.itson.Domain.Board;
import org.itson.Domain.Estados;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.playerToken;

/**
 *
 * @author PC
 */
public class VerificarCantidadFichasJugador implements KnowledgeSource <Integer,Player> 
{
    private Game game;
    
    public VerificarCantidadFichasJugador(Game game)
    {
        this.game = game;
    }    
    @Override
    public void update(Integer idJugador, Player u) 
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
        if(jugadorBuscado.emptyTokenList())
        {
            game.setEstadoJuego(Estados.JUGADOR_SIN_FICHAS);
        }
        else
        {
            game.setEstadoJuego(Estados.JUGADOR_CON_FICHAS);
        }
        
        game.setObservableChanged();
        game.notifyObservers();          
        
        
    }
    
}
