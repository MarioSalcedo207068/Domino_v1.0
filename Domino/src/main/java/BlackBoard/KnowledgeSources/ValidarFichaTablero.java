/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackBoard.KnowledgeSources;

import org.itson.Domain.BoardToken;
import org.itson.Domain.Game;
import org.itson.Domain.playerToken;

/**
 *
 * @author Equipo 02
 */
public class ValidarFichaTablero implements KnowledgeSource
{
    private Game game;
    
    public ValidarFichaTablero(Game game)
    {
        this.game = game;
    }
    
    public void update(playerToken playerToken, Boolean bool) 
    {
//        boolean resultado = false;
        
        //Si es True, la validación será direccionada al principio de la lista.
        if(bool == true)
        {
            BoardToken tokenInicio = game.getBoard().getFirstToken(); 
            if(tokenInicio.getLowerSide() == playerToken.getUpperSide() || tokenInicio.getLowerSide() == playerToken.getLowerSide())
            {
//                return true;
            }
        }
        
        else
            //Si es False, la validación será direccionada al fin de la lista.
        {
            BoardToken tokenFinal = game.getBoard().getLastToken();
            if(tokenFinal.getUpperSide() == playerToken.getUpperSide() || tokenFinal.getLowerSide() == playerToken.getLowerSide())
            {
//                return true;
            }
        } 
//        return resultado;        
    }




    
}
