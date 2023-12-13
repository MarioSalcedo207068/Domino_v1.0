package org.itson.Domain;

import BlackBoard.KnowledgeSources.KnowledgeSource;
import BlackBoard.KnowledgeSources.ValidarFichaTablero;
import java.lang.Thread.State;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


/**
 *
 * @author Equipo 02
 */
public final class Game extends Observable 
{
    private int numPlayers;
    private int numTokens;
    private List<Player> players;
    private Board board;
    private List<Dictionary> scoreList;
    private Estados estadoJuego;
    private List<Token> allTokens;
    private String prueba;
    //Métodos
    
    public Game() 
    {
        players = new LinkedList<>();

        this.estadoJuego=estadoJuego.JUEGO_ACTIVO;
        allTokens = new LinkedList<>();
//        setListOfTokens();
        
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }
    

    public Game(int numPlayers, int numTokens) {
        this.numPlayers = numPlayers;
        this.numTokens = numTokens;

        this.estadoJuego=estadoJuego.JUEGO_ACTIVO;

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
     * 
     * @return 
     */
    public Game startGame()
    {
        
        return this;
        
    };
    

    


    public List<playerToken> obtainTokenListFromPlayer(int id)
    {
        int posicionJugador = -1;
        for(int i = 0;players.size()>i;i++)
        {
            if(players.get(i).getId() == id)
            {
                posicionJugador = i;
            }
        }

        return players.get(posicionJugador).getTokenList();
    }
    
    
    public Player obtainPlayerInfo(int id)
    {
        int posicionJugador = -1;
        for(int i = 0;players.size()>i;i++)
        {
            if(players.get(i).getId() == id)
            {
                posicionJugador = i;
            }
        }        
        
        return players.get(posicionJugador);
        
    }
    


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Dictionary> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Dictionary> scoreList) {
        this.scoreList = scoreList;
    }
    
    public void establecerEstadoJuego()
    {
        estadoJuego = estadoJuego.JUEGO_ACTIVO;
    }
    
    
    public void setObservableChanged()
    {
        setChanged();
    }

    public Estados getEstadoJuego() {
        return estadoJuego;
    }

    public void setEstadoJuego(Estados estadoJuego) {
        this.estadoJuego = estadoJuego;
    }
    
    public void setListOfTokens()
    {
        Token tokenToAdd = null;
        tokenToAdd.setLowerSide(0);
        tokenToAdd.setUpperSide(0);
        // 0 / 0
        allTokens.add(tokenToAdd);
        
        tokenToAdd.setLowerSide(0);
        tokenToAdd.setUpperSide(1);
        // 0 / 1
        allTokens.add(tokenToAdd);
        
        tokenToAdd.setLowerSide(0);
        tokenToAdd.setUpperSide(2);
        // 0 / 2
        allTokens.add(tokenToAdd);
        
        tokenToAdd.setLowerSide(0);
        tokenToAdd.setUpperSide(3);
        // 0 / 3
        allTokens.add(tokenToAdd);
        
        tokenToAdd.setLowerSide(0);
        tokenToAdd.setUpperSide(4);
        // 0 / 4
        allTokens.add(tokenToAdd);       

        tokenToAdd.setLowerSide(0);
        tokenToAdd.setUpperSide(5);
        // 0 / 5
        allTokens.add(tokenToAdd);  
        
        tokenToAdd.setLowerSide(0);
        tokenToAdd.setUpperSide(6);
        // 0 / 6
        allTokens.add(tokenToAdd);        
        
        tokenToAdd.setLowerSide(2);
        tokenToAdd.setUpperSide(6);
        // 2 / 6
        allTokens.add(tokenToAdd);
        
        tokenToAdd.setLowerSide(3);
        tokenToAdd.setUpperSide(4);
        // 3 / 4
        allTokens.add(tokenToAdd);
        
        tokenToAdd.setLowerSide(3);
        tokenToAdd.setUpperSide(5);
        // 3 / 5
        allTokens.add(tokenToAdd);        
        
        tokenToAdd.setLowerSide(3);
        tokenToAdd.setUpperSide(6);
        // 3 / 6
        allTokens.add(tokenToAdd);  
        
        tokenToAdd.setLowerSide(4);
        tokenToAdd.setUpperSide(5);
        // 4 / 5
        allTokens.add(tokenToAdd);        
 
        tokenToAdd.setLowerSide(4);
        tokenToAdd.setUpperSide(6);
        // 4 / 6
        allTokens.add(tokenToAdd);  
        
        tokenToAdd.setLowerSide(5);
        tokenToAdd.setUpperSide(6);
        // 5 / 6
        allTokens.add(tokenToAdd);        

        tokenToAdd.setLowerSide(2);
        tokenToAdd.setUpperSide(5);
        // 2 / 5
        allTokens.add(tokenToAdd);
        
        tokenToAdd.setLowerSide(2);
        tokenToAdd.setUpperSide(4);
        // 2 / 4
        allTokens.add(tokenToAdd);

        tokenToAdd.setLowerSide(2);
        tokenToAdd.setUpperSide(3);
        // 2 / 3
        allTokens.add(tokenToAdd);
        
        tokenToAdd.setLowerSide(1);
        tokenToAdd.setUpperSide(6);
        // 1 / 6
        allTokens.add(tokenToAdd);
        
        tokenToAdd.setLowerSide(1);
        tokenToAdd.setUpperSide(5);
        // 1 / 5
        allTokens.add(tokenToAdd);
        
        tokenToAdd.setLowerSide(1);
        tokenToAdd.setUpperSide(4);
        // 1 / 4
        allTokens.add(tokenToAdd);        

        tokenToAdd.setLowerSide(1);
        tokenToAdd.setUpperSide(3);
        // 1 / 3
        allTokens.add(tokenToAdd);

        tokenToAdd.setLowerSide(1);
        tokenToAdd.setUpperSide(2);
        // 1 / 2
        allTokens.add(tokenToAdd);
        
        tokenToAdd.setLowerSide(6);
        tokenToAdd.setUpperSide(6);
        // 6 / 6
        allTokens.add(tokenToAdd);  
        
        tokenToAdd.setLowerSide(5);
        tokenToAdd.setUpperSide(5);
        // 5 / 5
        allTokens.add(tokenToAdd); 
        
        tokenToAdd.setLowerSide(4);
        tokenToAdd.setUpperSide(4);
        // 4 / 4
        allTokens.add(tokenToAdd); 
        
        tokenToAdd.setLowerSide(3);
        tokenToAdd.setUpperSide(3);
        // 3 / 3
        allTokens.add(tokenToAdd);   
 
        tokenToAdd.setLowerSide(2);
        tokenToAdd.setUpperSide(2);
        // 2 / 2
        allTokens.add(tokenToAdd); 

        tokenToAdd.setLowerSide(1);
        tokenToAdd.setUpperSide(1);
        // 1 / 1
        allTokens.add(tokenToAdd);        
    }
    
    public void removeTokenFromList(int index)
    {
        allTokens.remove(index);
    }
    
    
     public int obtenerNumeroRandom(int min, int max)
    {
        int n =(int)(Math.random() * (max - min)) + min;
        
        return n;
    }    
    public List<playerToken> giveTokens(int amountOfTokens)
    {
        List<playerToken> tokensToGive = null;
        if(amountOfTokens>allTokens.size())
        {
            return null;
        }
        else
        {
        
        
        for(int i = 0;i<amountOfTokens;i++)
          {
            int randomNumber = obtenerNumeroRandom(0,allTokens.size());
            playerToken tokenToGive = (playerToken) allTokens.get(randomNumber);
            tokensToGive.add(tokenToGive);
            removeTokenFromList(randomNumber);
          }            
        }
        

        
        return tokensToGive;
    }
    
    public Player searchTokenInPlayer(playerToken tokenToFind)
    {
        Player playerSelected = null;
        for(Player p:players)
        {
            if(p.getTokenList().contains(tokenToFind))
            {
                playerSelected = p;
                break;
            }
        }
        
        return playerSelected;
    }
    
}
    
    
