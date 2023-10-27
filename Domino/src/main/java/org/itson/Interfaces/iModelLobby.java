/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.Interfaces;

import org.itson.State.State;

/**
 *
 * @author aleja
 */
public interface iModelLobby {
    public State obtainGameState();
    public int obtainNumOfPlayers();
    public String obtainGamePlayerName();
    public String obtainGamePlayerAvatar();
}
