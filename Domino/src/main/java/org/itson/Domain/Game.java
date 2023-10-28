/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Domain;

import java.util.LinkedList;
import java.util.List;
import org.itson.State.State;

/**
 *
 * @author aleja
 */
public class Game {
    private int numPlayers;
    private int numTokens;
    private State gameState;
    private List players = new LinkedList<Player>();
    Board board;
    private List TokenList = new LinkedList<Token>();
    
    
    //Métodos
    
    public Game() {
    }

    public Game(int numPlayers, int numTokens) {
        this.numPlayers = numPlayers;
        this.numTokens = numTokens;
    }
    
    
    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int getNumTokens() {
        return numTokens;
    }

    public void setNumTokens(int numTokens) {
        this.numTokens = numTokens;
    }
    /**
     * Finalizar el turno según el estado del Jugador
     */
    public void endTurn(){};
    /**
     * Revisar calculatePlayerScore
     */
    public void calculatePlayerScore(){};
    /**
     * 
     */
    public void startGame(){};
    
    /**
     * Cómo revolver las fichas
     * @param numTokens
     * @return 
     */
    public List obtainTokens(int numTokens){return TokenList;}
    /**
     * Asignar a jugador correspondiente
     * @param TokenList 
     * @param id 
     */
    public void assignTokensToPlayer(List TokenList, int id){};
    
    public void assignRemainingTokensToPond(){};
    
    public List obtainTokenListFromPlayer(int id){return TokenList;}
    
    public List addTokenToBoard(Token BoardTokenList){return BoardTokenList;}
    
}