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
import org.itson.Domain.Token;
import org.itson.Domain.playerToken;
import org.itson.Interfaces.iModelPartida;


/**
 *
 * @author Equipo 02
 */
public class modelPartida implements iModelPartida{
    private Game game;
    
    
    public void obtainTokenFromPond()
    {
        
    }
    public void endCurrentTurn()
    {
        game.setEstadoJuego(Estados.JUEGO_ACTIVO);
    }
    
//    public List getHighestMule()
//    {
//
//        
//        Token token = null;
//        token.setLowerSide(0);
//        token.setUpperSide(0);
//        int playerPosition = -1;
//        
//        for(int i = 0;i<game.getPlayers().size();i++)
//        {
//            if(game.getPlayers().get(i).highestMule() > 0)
//            {
//                int positionOfHighestMule = game.getPlayers().get(i).highestMule();
//                if(game.getPlayers().get(i).getTokenList().get(positionOfHighestMule).getSumaFicha() > token.getSumaFicha())
//                {
//                    playerPosition = i;
//                    token = game.getPlayers().get(i).getTokenList().get(positionOfHighestMule);
//                }
//            }
//        }
//        
//        game.getBoard().addTokenToBoard(token);
//        game.getPlayers().get(playerPosition).removeToken(token);
//        
//        
//    }
//    
//    
//    public List returnTokensToPond(Player player)
//    {
//        Player playerToRemove = null;
//        for(int i = 0; i>game.getPlayers().size();i++)
//        {
//            if(game.getPlayers().get(i).getId() == player.getId())
//            {
//                playerToRemove = game.getPlayers().get(i);
//                break;
//            }
//        }
//        
//        game.getBoard().getPond().addTokensToPond(playerToRemove.getTokenList());
//    }

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
