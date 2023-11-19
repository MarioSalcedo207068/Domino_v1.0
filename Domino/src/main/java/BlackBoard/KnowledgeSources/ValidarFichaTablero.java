/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackBoard.KnowledgeSources;

import org.itson.Domain.BoardToken;
import org.itson.Domain.Game;
import org.itson.Domain.Token;
import org.itson.Domain.playerToken;

/**
 *
 * @author Equipo 02
 */
public class ValidarFichaTablero implements KnowledgeSource<Token,Boolean>    
{
    private Game game;
    
    public ValidarFichaTablero(Game game)
    {
        this.game = game;
    }
    


    @Override
    public void update(Token tokenFromPlayer, Boolean position) 
    {
        if(position.equals(true))
        {
            BoardToken tokenInicio = game.getBoard().getFirstToken(); 
            if(tokenInicio.getLowerSide().equals(tokenFromPlayer.getUpperSide()) || tokenInicio.getLowerSide() == tokenFromPlayer.getLowerSide())
            {
                //                return true;
            }
        }
        else
        {
            BoardToken tokenFinal = game.getBoard().getLastToken();
            if(tokenFinal.getUpperSide().equals(tokenFromPlayer.getUpperSide()) || tokenFinal.getLowerSide().equals(tokenFromPlayer.getLowerSide()))
            {
//                return true;                
            }
        }
//        return resultado;      

    }







    
}
