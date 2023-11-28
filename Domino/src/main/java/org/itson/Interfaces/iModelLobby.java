/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.Interfaces;

import java.util.List;
import org.itson.Domain.Estados;



/**
 *
 * @author Equipo 02
 */
public interface iModelLobby {
    public Estados obtainGameState();
    public int obtainNumOfPlayers();
    public List<String>  obtainGamePlayerName();
    public List<String>  obtainGamePlayerAvatar();
}
