
package org.itson.Presenter;

import org.itson.Domain.Game;
import org.itson.Interfaces.IMenu;
import org.itson.Interfaces.IPlayerView;
import org.itson.Interfaces.iModelMenu;
import org.itson.Model.modelLobby;
import org.itson.Model.modelMenu;
import org.itson.frames.FrmInicio;

/**
 *
 * @author Equipo 02
 */

/**
 * @author Equipo 02
 */
public class presenterMenu implements IMenu  {

    

    private modelMenu model;
    private presenterLobby presenterLobby;
    private FrmInicio frmInicio;
    
    public presenterMenu()
    {
        model = new modelMenu();
        presenterLobby = new presenterLobby();
        frmInicio = new FrmInicio(this);
    }
    
    @Override
    public void returnToMenu() 
    {
        frmInicio.setVisible(true);
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
    
    public void connectWithPresenterLobby() 
    {
        
        presenterLobby.setGameData(this.model.getGame());
        presenterLobby.showLobby();
        
    }


    @Override
    public void verifyGameData(int numOfTokens, int numOfPlayers) 
    {
        
        connectWithPresenterLobby();
    }
    
    
}
