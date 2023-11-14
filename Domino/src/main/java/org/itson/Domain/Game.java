package org.itson.Domain;

import BlackBoard.KnowledgeSources.KnowledgeSource;
import BlackBoard.KnowledgeSources.ValidarFichaTablero;
import java.lang.Thread.State;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import org.itson.Interfaces.iGame;

/**
 *
 * @author Equipo 02
 */
public class Game implements iGame
{
    private int numPlayers;
    private int numTokens;
    private boolean gameState;
    private List<Player> players;
    private Board board;
    private State subjectState;

    //Métodos
    
    public Game() 
    {
        players = new LinkedList<>();

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
    
    
//    /**
//     * Revisar calculatePlayerScore
//     * @return 
//     */
//    public List<Dictionary> calculatePlayerScore()
//    {
//        
//        int sumaValorFicha = 0;
//        List<Dictionary> puntuaciones = null;
//        for(Player jugador:players)
//        {
//            Dictionary<String, Integer> puntuacion= new Hashtable<>();
//            List<playerToken> listaFichas = jugador.getAllTokenList();
//            for(playerToken ficha:listaFichas)
//            {
//                sumaValorFicha = ficha.getLowerSide() + ficha.getUpperSide();
//            }
//            puntuacion.put(jugador.getName(), sumaValorFicha);
//            puntuaciones.add(puntuacion);
//        }
//        
//        return puntuaciones;
//    }
//    
    /**
     * 
     * @return 
     */
    public Game startGame()
    {
        
        return this;
        
    };
    
//    /**
//     * Cómo revolver las fichas
//     * @param numTokens
//     * @return 
//     */
//    public List obtainTokens(int numTokens)
//    {
//        List fichasExtraidas = null;
//        for(int i = 0;numTokens>i;i++)
//        {
//            int numRandom = obtenerNumeroRandom(0,TokenList.size());
//            fichasExtraidas.add(TokenList.get(numRandom));
//            TokenList.remove(numRandom);
//        }
//        return fichasExtraidas;
//    }
    
//    /**
//     * Asignar a jugador correspondiente
//     * @param TokenList 
//     * @param id 
//     */
//    public void assignTokensToPlayer(List TokenList, int id)
//    {
//        int posicionJugador = -1;
//        for(int i = 0;players.size()>i;i++)
//        {
//            if(players.get(i).getId() == id)
//            {
//                posicionJugador = i;
//            }
//        }
//        players.get(posicionJugador).setTokenList(TokenList);
//    };
    

    public List obtainTokenListFromPlayer(int id)
    {
        int posicionJugador = -1;
        for(int i = 0;players.size()>i;i++)
        {
            if(players.get(i).getId() == id)
            {
                posicionJugador = i;
            }
        }

        return players.get(posicionJugador).getAllTokenList();
    }
    
    public List addTokenToBoard(/*Token BoardTokenList*/ playerToken selectedToken)
    {
        board.addTokenToBoard(selectedToken);
        return board.getPlacedToken();
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
    
//    public void returnTokensToPond(List<Token> tokenList)
//    {
//        board.getPond().addTokensToPond(tokenList);    
//    }
    
    
//    
//    /**
//     * Verificar si el jugador está activo en la partida.
//     * @param player 
//     */
//    public void playerStateToInactive(Player player)
//    {
//        
//    };

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
    
    
    
    

    @Override
    public void notifyObserver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public State getState() {
        return subjectState;
    }

    public void setState(State subjectState) {
        this.subjectState = subjectState;
    }

    @Override
    public void register(org.itson.Interfaces.Observer ob) 
    {
        
    }

    @Override
    public void unregister(org.itson.Interfaces.Observer ob) 
    {
        
    }
    
    
    
}