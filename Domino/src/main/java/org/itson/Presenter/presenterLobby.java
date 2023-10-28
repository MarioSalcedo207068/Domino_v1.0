/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Presenter;

import org.itson.Domain.Game;
import org.itson.Model.modelLobby;
import org.itson.Interfaces.ILobby;
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
    
}
