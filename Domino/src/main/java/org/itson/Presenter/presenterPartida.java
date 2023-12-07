/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Presenter;

import java.util.Dictionary;
import java.util.List;
import org.itson.Domain.Game;
import org.itson.Domain.Token;
import org.itson.Interfaces.IPartida;
import org.itson.Model.modelPartida;
import org.itson.drawClass.BoardDraw;
import org.itson.drawClass.GameElement;
import org.itson.drawClass.TokenDraw;
import org.itson.frames.FrmPartida;

/**
 *
 * @author Equipo 02
 */
public class presenterPartida implements IPartida{
    BoardDraw boardGraph = new BoardDraw();
    TokenDraw tokenGraph = new TokenDraw();
    FrmPartida frm = new FrmPartida();
    modelPartida model = new modelPartida();
    
    public void endMatch(List<Dictionary> scoreList){
    
        
    };
    
    public void endCurrentTurn(){
        
    };
    
    public void setVisiblePartida()
    {
        frm.setVisible(true);
    }

    @Override
    public void placeTokenToBoard(Token token) {
        tokenGraph.setSideADraw(token.getUpperSide());
        tokenGraph.setSideBDraw(token.getLowerSide());
        boardGraph.addTokens(tokenGraph);
    }

    @Override
    public void setGameConfig(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getTokenFromPond() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void playerLeftMatch() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void playerVotedEnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void obtainTokenFromPond() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updatePlayerTokenList(List<Token> tokenList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void boardError() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pondError() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void exitGame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
