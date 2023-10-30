/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aleja
 */
public class Board extends BoardToken{
    private List<BoardToken> placedToken = new LinkedList();
    private pondToken pond;
//    private List tokenList;
    
    public List addTokenToBoard(Token tokenPlayer)
    {
        this.placedToken.add((BoardToken) tokenPlayer);
        return this.placedToken;
    }
    
    
    public List<BoardToken> getPlacedToken() {
        return placedToken;
    }
    
    
    /**
     * Método para poner fichas, para validar antes de que se ponga en board
     * @param playerToken ficha de jugador a validar
     * @param bool Orientación de la ficha a colocar. De ser true, se comparará para la izquierda de la fila de fichas,
     * de ser false se comparará con la parte de la derecha.
     * @return 
     */
    public Boolean validateToken(playerToken playerToken, Boolean bool){
//        if (bool==true) 
//        {
//            if(placedToken.get(0))
//        }
        return true;}

    public pondToken getPond() {
        return pond;
    }

    public void setPond(pondToken pond) {
        this.pond = pond;
    }


    
    
    
}
