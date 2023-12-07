
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
    
    
    /**
     * PRUEBAS EXTRAS 
     * 
     */

    
    private LinkedList<BoardToken> placedToken = new LinkedList();
    private Pond pond;

    
//    private List tokenList;

    public Board(int upperSide, int lowerSide) {
        super(upperSide, lowerSide);
    }
    
    
    
    public List addTokenToBoard(Token tokenPlayer)
    {
        this.placedToken.add((BoardToken) tokenPlayer);
        return this.placedToken;
     
        
    }
    
    
    public List<BoardToken> getTokenList() {
        return placedToken;
    }

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

    public boolean addTokenToBoard(Token token, Integer valueOf) 
    {
        return true;
    }
    
    
}
