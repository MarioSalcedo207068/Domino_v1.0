/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.Interfaces;

import java.util.List;
import org.itson.Domain.BoardToken;
import org.itson.Domain.Estados;
import org.itson.Domain.playerToken;

/**
 *
 * @author Equipo 02
 */
public interface iModelPartida {
    public String obtainPlayerName(int id);
    public String obtainPlayerAvatar(int id);
    public int obtainPondNumberOfTokens();
    public Estados obtainGameState();
    public List<BoardToken> obtainBoardTokenList();
    public List<playerToken> obtainPlayerTokenList(int id);
    public int obtainPlayerNumberOfTokens(int id);
}
