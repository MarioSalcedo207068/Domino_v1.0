/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Presenter;

import BlackBoard.Control;
import java.util.Dictionary;
import java.util.List;
import java.util.Observable;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.Token;
import org.itson.Interfaces.IPartida;
import org.itson.Interfaces.iModelPartida;
import org.itson.Model.modelPartida;
import org.itson.drawClass.BoardDraw;
import org.itson.drawClass.GameElement;
import org.itson.drawClass.TokenDraw;
import org.itson.frames.FrmPartida;

/**
 *
 * @author Equipo 02
 */
public class presenterPartida implements IPartida {
    BoardDraw boardGraph;
    TokenDraw tokenGraph;
    FrmPartida frm;
    modelPartida model;
    Control ctrl;
    
    public presenterPartida()
    {
        boardGraph = new BoardDraw();
        tokenGraph = new TokenDraw();
        frm = new FrmPartida();
        model = new modelPartida();
        ctrl = new Control();
        model.setControl(ctrl);
    }
    
    @Override
    public void endMatch(List<Dictionary> scoreList)
    {
        
    };
    
    public void endCurrentTurn(){
        
    };
    
    public void setVisiblePartida()
    {
        frm.setVisible(true);
    }

    @Override
    public void placeTokenToBoard(Token token,Player player,boolean side) {
//        tokenGraph.setSideADraw(token.getUpperSide());
//        tokenGraph.setSideBDraw(token.getLowerSide());
//        boardGraph.addTokens(tokenGraph);


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
    public void obtainTokenFromPond(Player player) 
    {
        
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
    
    public void updateDataOnScreen(Game game)
    {
        this.model.setGame(game);
        frm.updateView(this.model);
    }
    
    public void errorTokenValidation()
    {
        
    }
    
    public void errorPondToken()
    {
        
    }

    @Override
    public void endTurn(Integer idPlayer) 
    {
        
    }

    public BoardDraw getBoardGraph() {
        return boardGraph;
    }

    public void setBoardGraph(BoardDraw boardGraph) {
        this.boardGraph = boardGraph;
    }

    public TokenDraw getTokenGraph() {
        return tokenGraph;
    }

    public void setTokenGraph(TokenDraw tokenGraph) {
        this.tokenGraph = tokenGraph;
    }

    public FrmPartida getFrm() {
        return frm;
    }

    public void setFrm(FrmPartida frm) {
        this.frm = frm;
    }

    public modelPartida getModel() {
        return model;
    }

    public void setModel(modelPartida model) {
        this.model = model;
        this.model.setControl(ctrl);
        
    }

    public Control getCtrl() {
        return ctrl;
    }

    public void setCtrl(Control ctrl) {
        this.ctrl = ctrl;
        this.ctrl.addObserver(this);
    }
    
    
    

    @Override
    public void update(Observable o, Object arg) 
    {
        updateDataOnScreen((Game) arg);
    }
}
