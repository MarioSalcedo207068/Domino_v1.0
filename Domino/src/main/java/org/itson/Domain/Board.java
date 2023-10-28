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
public class Board extends BoardToken{
    private List placedToken = new LinkedList<BoardToken>();
//    private List tokenList;
    
    public List addTokenToBoard(Token tokenPlayer){
        this.placedToken.add(tokenPlayer);
        return this.placedToken;
    }
    
    /**
     * Método para poner fichas, para validar antes de que se ponga en board
     * @param playertoken ficha de jugador a validar
     * @param bool estado de ficha true en caso válido
     * @return 
     */
    public Boolean validateToken(playerToken playertoken, Boolean bool){
        if (bool==true) {
        }
        return true;}
}
