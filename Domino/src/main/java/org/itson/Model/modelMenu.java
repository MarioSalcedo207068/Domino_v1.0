
package org.itson.Model;

import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Interfaces.iModelMenu;
/**
 *
 * @author Equipo 02
 */
public class modelMenu implements iModelMenu{
    Player player;
    Game game;
    
    public void createGame(int numPlayer, int numTokensPerPlayers)
    {
        this.game = new Game(numPlayer,numTokensPerPlayers);
    };
    
    public void addPlayer(String name, String avatar )
    {
        
        Player playerToAdd = new Player(name,avatar);
        game.getPlayers().add(playerToAdd);
        
    }

    //AQUÍ SE CAMBIÓ DE VOID A STRING (SE CAMBIÓ DESDE LA INTERFACE IMODELMENU EN CASO DE NECESITAR CAMBIAR
    //ESTABA COMO VOID.
    @Override
    public String obtainPlayerName() {
        return player.getName();
    }

    @Override
    public String obtainPlayerAvatar() {
        return player.getAvatar();
    }

    public Game getGame() {
        return game;
    }
    
    
}
