/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Interfaces;

import java.util.Dictionary;
import java.util.List;
import org.itson.Domain.Game;
import org.itson.Domain.Token;

/**
 *
 * @author aleja
 */
public interface IPartida {
    public void placeTokenToBoard(Token token);
    public void setGameConfig(Game game);
    public void getTokenFromPond();
    public void playerLeftMatch();
    public void playerVotedEnd();
    public void endMatch(List<Dictionary> scoreList);
    public void obtainTokenFromPond();
    public void updatePlayerTokenList(List<Token> tokenList);
    public void boardError();
    public void pondError();
    public void exitGame();
    
}
