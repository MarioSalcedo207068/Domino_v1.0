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
public class Pond 
{
    List<Token> tokenList=new LinkedList();
    
    public Token pullToken()
    {
        int numRandom = obtenerNumeroRandom(0,tokenList.size());
        Token fichaDevuelta = tokenList.get(numRandom);
        tokenList.remove(numRandom);
        return fichaDevuelta;
        
    }
    
    
    public void addTokensToPond(List<Token> incomingTokens)
    {
        tokenList.addAll(incomingTokens);
    };
    
    
    public int obtenerNumeroRandom(int min, int max)
    {
        int n =(int)(Math.random() * (max - min)) + min;
        
        return n;
    }    
}
