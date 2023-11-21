/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Model;

import java.util.List;
import org.itson.Domain.BoardToken;
import org.itson.Domain.Estados;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.playerToken;
import org.itson.Interfaces.iModelPartida;


/**
 *
 * @author Equipo 02
 */
public class modelPartida implements iModelPartida{
    private Game game;
    
    
    public void obtainTokenFromPond(){};
    public void endCurrentTurn(){};
    public List getHighestMule(){return null;}
    public List returnTokensToPond(Player player){return null;}

    @Override
    public String obtainPlayerName(int id) 
    {
        Player p;
        p = game.obtainPlayerInfo(id);
        return p.getName();
    }

    @Override
    public String obtainPlayerAvatar(int id) 
    {
        Player p;
        p = game.obtainPlayerInfo(id);
        return p.getAvatar();
    }

    @Override
    public int obtainPondNumberOfTokens() 
    {
        return game.getBoard().getPond().getNumOfTokens();
    }



    @Override
    public List<BoardToken> obtainBoardTokenList() 
    {
        return game.getBoard().getTokenList();
    }

    @Override
    public List<playerToken> obtainPlayerTokenList(int id) {
        Player p;
        p = game.obtainPlayerInfo(id);
        return p.getTokenList();
    }

    @Override
    public int obtainPlayerNumberOfTokens(int id) 
    {
        Player p;
        p = game.obtainPlayerInfo(id);
        return p.getTokenList().size();
    }

    @Override
    public Estados obtainGameState() {
        return game.getEstadoJuego();
    }

    
}
