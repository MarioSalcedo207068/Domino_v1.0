/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Interfaces;

import java.util.Dictionary;
import java.util.List;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.Token;

/**
 *
 * @author Equipo 02
 */
public interface IPartida {

    public void placeTokenToBoard(Token tokenToPlace,Player player,boolean side);
    public void setGameConfig(Game game);
    public void getTokenFromPond();
    public void playerLeftMatch();
    public void playerVotedEnd();
    public void endMatch(List<Dictionary> scoreList);
    public void endTurn(Integer idPlayer);
    public void obtainTokenFromPond(Player player);
    public void updatePlayerTokenList(List<Token> tokenList);
    public void boardError();
    public void pondError();
    public void exitGame();
    
}
