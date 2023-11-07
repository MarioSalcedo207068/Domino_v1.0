
package org.itson.Presenter;

import org.itson.Domain.Game;
import org.itson.Model.modelLobby;
import org.itson.Interfaces.ILobby;
import org.itson.frames.FrmConfiguracionJuego;
import org.itson.frames.FrmInicio;
import org.itson.frames.FrmLobby;
import org.itson.frames.FrmModificarAvatar;
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
    
    public void setVisibleConfiguracionJuego()
    {
        
        FrmConfiguracionJuego frm = new FrmConfiguracionJuego();
        frm.setVisible(true);
   
    }
    
    public void setVisibleModificarAvatar()
    {
        FrmModificarAvatar frm = new FrmModificarAvatar();
        frm.setVisible(true);
    }
    
    public void setVisibleLobby()
    {
        FrmLobby frm = new FrmLobby();
        frm.setVisible(true);
    }
    
    public void setVisibleInicio()
    {
        FrmInicio frm = new FrmInicio();
        frm.setVisible(true);
    }
    
    public void setVisiblePartida()
    {
        FrmPartida frm = new FrmPartida();
        frm.setVisible(true);
    }
    
    
    
    
}
