/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.View;

import java.util.List;
import org.itson.Domain.Player;
import org.itson.Domain.Token;
import org.itson.drawClass.BoardDraw;

/**
 *
 * @author Equipo 02
 */
public class viewPartida {
    
    BoardDraw boardDraw;
    
    public void showPlayerInfo(){};
    public void showGameInfo(){};
    public void placeToken(){};
    public List updatePlayerTokens(){
        return null;
    };
    public void notifyUnvalidToken(){};
    public void pullToken(){};
    public void notifyEmptyPond(){};
    public void updateBoardTokens(List<Token> tokenList){};
    public void passTurn(){};
    public void exitGame(){};
    public void notifyPlayerExit(Player player){};
    public void updatePondTokens(List<Token> tokenList){};
}
