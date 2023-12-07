package org.itson.Model;

import java.util.List;
import org.itson.Domain.Estados;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Interfaces.iModelLobby;


/**
 *
 * @author Equipo 02
 */
public class modelLobby implements iModelLobby{
    Game game = new Game();
    Player player = new Player();
    
    public Game startGame()
    {
        return this.game;
    };

    @Override
    public Estados obtainGameState() {
        return game.getEstadoJuego();
    }

    @Override
    public int obtainNumOfPlayers() {
        return game.getNumPlayers();
    }

    @Override
    public List<String> obtainGamePlayerName() 
    {
        List<String> listaNombres = null;
        
        for (Player jugador : game.getPlayers()) 
        {
            listaNombres.add(jugador.getName());
        }
        return listaNombres;
    }

    @Override
    public List<String> obtainGamePlayerAvatar() 
    {
        List<String> listaAvatares = null;
        
        for (Player jugador : game.getPlayers()) 
        {
            listaAvatares.add(jugador.getAvatar());
        }
        return listaAvatares;
    }


}
