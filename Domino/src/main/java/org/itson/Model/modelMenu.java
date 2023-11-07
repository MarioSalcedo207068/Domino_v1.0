/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Model;

import java.io.Console;
import org.itson.Domain.Player;
import org.itson.Interfaces.iModelMenu;
/**
 *
 * @author Equipo 02
 */
public class modelMenu implements iModelMenu{
    Player player;
    
    public void createGame(){};

    //AQUÍ SE CAMBIÓ DE VOID A STRING (SE CAMBIÓ DESDE LA INTERFACE IMODELMENU EN CASO DE NECESITAR CAMBIAR
    //ESTABA COMO VOID.
    @Override
    public String obtainPlayerName() {
        return player.getName();
    }

    @Override
    public String obtainPlayerAvatar() {
        return player.getAvatar();
    }
}
