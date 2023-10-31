/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Presenter;

import org.itson.Interfaces.IMenu;
import org.itson.Interfaces.IPlayerView;
import org.itson.Interfaces.iModelMenu;
import org.itson.Model.modelLobby;
import org.itson.Model.modelMenu;

/**
 *
 * @author aleja
 */

/**
 * Implementación de iModelMenu PRUEBA para método obtainPlayerName
 * @author aleja
 */
public class presenterMenu implements IMenu, iModelMenu{
    public void createNewGame(){};
    
    /**
     * Instancia de modelMenu == model
     */
    private modelMenu model;
    private IPlayerView playerView;

    @Override
    public void returnToMenu() {
        
    }

    @Override
    public String obtainPlayerName() {
        String playerName = model.obtainPlayerName();
        playerView.DisplayPlayerName(playerName);
        return playerName;
    }

    @Override
    public void obtainPlayerAvatar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
