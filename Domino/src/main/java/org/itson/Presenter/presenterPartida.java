/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Presenter;

import BlackBoard.Control;
import BlackBoard.EstadosControl;
import java.util.Dictionary;
import java.util.List;
import java.util.Observable;
import org.itson.Domain.Estados;
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
    if (o != null && o instanceof Control) 
    {
        this.setCtrl((Control) o);
        actualizacion(arg);
    } else
    {System.out.println("NO ES UNA INSTANCIA DE CONTROL");}
    
    }

    private void actualizacion(Object arg) 
    {
        EstadosControl e = ctrl.getEstado();
        
        switch (e)
        {
            case ctrl_JUGADOR_CON_FICHAS:
            model.setGame((Game) arg);
            frm.updateView(model);
            break;
            
            
            case ctrl_JUGADOR_FICHA_POZO:
            model.setGame((Game) arg);
            frm.updateView(model);
            break;
            
            
            case ctrl_PUNTUACIONES_CALCULADO:
            model.setGame((Game) arg);
            frm.showScoreList(model);
            break;
            
            case ctrl_FICHA_INVALIDA:
            model.setGame((Game) arg);
            frm.showError(0);    
            break; 
            
            
            case ctrl_ASIGNAR_FICHA:
            model.setGame((Game) arg);
            frm.updateView(model);
            break;    
                
        }
    }
}
