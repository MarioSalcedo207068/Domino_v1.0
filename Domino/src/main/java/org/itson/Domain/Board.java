/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Domain;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aleja
 */
public class Board {
    private List placedToken = new LinkedList<BoardToken>();
    private List tokenList;
    
    public List addTokenToBoard(Token tokenPlayer){
        
                this.tokenList.add(tokenPlayer);
        return this.tokenList;}
}
