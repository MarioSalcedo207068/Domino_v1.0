/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.State;

import org.itson.Domain.Game;
import org.itson.Domain.Player;

/**
 *
 * @author aleja
 */
public abstract class State {
    protected Player player;
    protected Game game;
    
    public State(Player player){this.player=player;}

    public State(Game game) {this.game = game;}
    
}
