/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.drawClass;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Equipo 02
 */
public class BoardDraw extends GameElement{
    //Atributos
    private List TokenList=new LinkedList<TokenDraw>();
    
    //Métodos
    public void addTokens(TokenDraw td){};
    public void deleteTokens(TokenDraw td){};
    @Override
    public void draw(){};
}
