
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
    modelLobby model;
    FrmLobby frm;
    presenterPartida pp; 
    presenterMenu pm;
    
    
    public presenterLobby()
    {
        model = new modelLobby();
        pp = new presenterPartida();
        pm = new presenterMenu();
        frm = new FrmLobby(this);
        
    }
    
    public void createNewGame(Game game)
    {
        
    };
    
    public void connectGamePresenter()
    {
        pp.setVisiblePartida();
        
    };

    @Override
    public void startGame() 
    {
        
    } 
    

    @Override
    public void showLobby() 
    {
        frm.setVisible(true);
    }

    @Override
    public void setVisiblePartida() 
    {
        
    }
    
    public void setGameData(Game game)
    {
        
    }     
  
}
