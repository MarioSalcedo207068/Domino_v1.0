package org.itson.Model;

import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Interfaces.iModelLobby;
import org.itson.State.State;

/**
 *
 * @author aleja
 */
public class modelLobby implements iModelLobby{
    Game game = new Game();
    Player player = new Player();
    
    public Game startGame()
    {
        
        
        return this.game;
    };

    @Override
    public State obtainGameState() {
        return null;
    }

    @Override
    public int obtainNumOfPlayers() {
        return 0;
    }

    @Override
    public String obtainGamePlayerName() {
        return null;
    }

    @Override
    public String obtainGamePlayerAvatar() {
        return null;
    }
}
