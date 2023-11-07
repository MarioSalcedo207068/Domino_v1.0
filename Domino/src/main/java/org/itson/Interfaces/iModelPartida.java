/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.Interfaces;

import java.util.List;

/**
 *
 * @author Equipo 02
 */
public interface iModelPartida {
    public String obtainPlayerName();
    public String obtainPlayerAvatar();
    public int obtainPondNumberOfTokens();
    public boolean obtainGameState();
    public List obtainBoardTokenList();
    public List obtainPlayerTokenList();
    public int obtainPlayerNumTokenList();
}
