
package org.itson.Domain;


import BlackBoard.KnowledgeSources.KnowledgeSource;
import BlackBoard.KnowledgeSources.ValidarFichaTablero;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Equipo 02
 */
public class Board extends BoardToken{
    private LinkedList<BoardToken> placedToken = new LinkedList();
    private Pond pond;

    
//    private List tokenList;
    
    
    
    public List addTokenToBoard(Token tokenPlayer)
    {
        this.placedToken.add((BoardToken) tokenPlayer);
        return this.placedToken;
     
        
    }
    
    
    public List<BoardToken> getTokenList() {
        return placedToken;
    }
    
    
//    /**
//     * Método para poner fichas, para validar antes de que se ponga en board
//     * @param playerToken ficha de jugador a validar
//     * @param bool Orientación de la ficha a colocar. De ser true, se comparará para la izquierda de la fila de fichas,
//     * de ser false se comparará con la parte de la derecha.
//     * @return 
//     */
//    public Boolean validateToken(playerToken playerToken, Boolean bool)
//    {
//        boolean resultado = false;
//        
//        //Si es True, la validación será direccionada al principio de la lista.
//        if(bool == true)
//        {
//            BoardToken tokenInicio = placedToken.getFirst(); 
//            if(tokenInicio.getLowerSide() == playerToken.getUpperSide() || tokenInicio.getLowerSide() == playerToken.getLowerSide())
//            {return true;}
//        }
//        
//        else
//            //Si es False, la validación será direccionada al fin de la lista.
//        {
//            BoardToken tokenFinal = placedToken.getLast();
//            if(tokenFinal.getUpperSide() == playerToken.getUpperSide() || tokenFinal.getLowerSide() == playerToken.getLowerSide())
//            {return true;}
//        } 
//        return resultado;
//    }

    public Pond getPond() {
        return pond;
    }

    public void setPond(Pond pond) {
        this.pond = pond;
    }


    public BoardToken getLastToken()
    {
        return placedToken.getLast();
    }
    
    public BoardToken getFirstToken()
    {
        return placedToken.getFirst();
    }
    
    
}
