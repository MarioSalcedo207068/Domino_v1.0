
package org.itson.Presenter;

import org.itson.Domain.Game;
import org.itson.Interfaces.IMenu;
import org.itson.Interfaces.IPlayerView;
import org.itson.Interfaces.iModelMenu;
import org.itson.Model.modelLobby;
import org.itson.Model.modelMenu;

/**
 *
 * @author Equipo 02
 */

/**
 * Implementación de iModelMenu PRUEBA para método obtainPlayerName
 * @author aleja
 */
public class presenterMenu implements IMenu  {

    
    /**
     * Instancia de modelMenu == model
     */
    private modelMenu model;
    

    @Override
    public void returnToMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addPlayer(String playerName, String playerAvatar) 
    {
        model.addPlayer(playerName, playerAvatar);
    }

    @Override
    public void createNewGame(int numPlayers, int numTokensPerPlayers) 
    {
        model.createGame(numPlayers, numTokensPerPlayers);
    }
    
    
}
