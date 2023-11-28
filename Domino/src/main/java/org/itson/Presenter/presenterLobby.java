
package org.itson.Presenter;

import org.itson.Domain.Game;
import org.itson.Model.modelLobby;
import org.itson.Interfaces.ILobby;
import org.itson.frames.FrmInicio;
import org.itson.frames.FrmLobby;
import org.itson.frames.FrmPartida;
/**
 *
 * @author aleja
 */
public class presenterLobby implements ILobby{
    modelLobby ModelLobby;
    
    public void createNewGame(Game game){};
    public void connectGamePresenter(){};

    @Override
    public void startGame() {
        
    } 
    

    @Override
    public void showLobby() 
    {
        FrmLobby frm = new FrmLobby();
        frm.setVisible(true);
    }
  
}
