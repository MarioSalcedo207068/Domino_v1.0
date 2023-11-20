
package org.itson.Presenter;

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
public class presenterMenu {
    public void createNewGame(){};
    
    /**
     * Instancia de modelMenu == model
     */
    private modelMenu model;
    private IPlayerView playerView;

    public void obtainPlayerName() {
       
        playerView.DisplayPlayerName(model.obtainPlayerName());
        
    }
    
    public void obtainPlayerAvatar()
    {
        playerView.DisplayPlayerName(model.obtainPlayerAvatar());
    }
    
    
}
