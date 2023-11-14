/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackBoard.KnowledgeSources;

import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.playerToken;

/**
 *
 * @author Equipo 02
 */
public class InsertarFichaJugadorAlTablero implements KnowledgeSource {
    
    private Game game;
    public InsertarFichaJugadorAlTablero(Game game)
    {
        this.game = game;
    }
    
    
    public void update(playerToken fichaJugador, Player jugador) 
    {
        for(Player players : game.getPlayers())
        {
            if(players.getId() == jugador.getId())
            {
                players.removeToken(fichaJugador);
                game.getBoard().addTokenToBoard(fichaJugador);
                break;
            }
        }
    }
    
    
    
}
