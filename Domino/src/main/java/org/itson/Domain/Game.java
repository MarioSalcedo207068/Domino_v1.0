package org.itson.Domain;

import java.util.LinkedList;
import java.util.List;
import org.itson.State.State;

/**
 *
 * @author aleja
 */
public class Game 
{
    private int numPlayers;
    private int numTokens;
    private State gameState;
    private List<Player> players;
    private Player player;
    private Board board;
    private List<Token> TokenList ;
    
    
    //Métodos
    
    public Game() 
    {
        TokenList = new LinkedList<>();
        players = new LinkedList<>();
    }

    public Game(int numPlayers, int numTokens) {
        this.numPlayers = numPlayers;
        this.numTokens = numTokens;
        TokenList = new LinkedList<>();
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
     * @return 
     */
    public List<Score> calculatePlayerScore()
    {
        
        int sumaValorFicha = 0;
        List<Score> puntuaciones = null;
        for(Player jugador:players)
        {
            Score puntuacion = null;
            List<playerToken> listaFichas = jugador.getAllTokenList();
            for(playerToken ficha:listaFichas)
            {
                sumaValorFicha = ficha.getLowerSide() + ficha.getUpperSide();
            }
            puntuacion.setScore(sumaValorFicha);
            puntuacion.setPlayerName(jugador.getName());
            puntuaciones.add(puntuacion);
        }
        
        return puntuaciones;
    }
    
    /**
     * 
     */
    public void startGame()
    {
        
        
        
    };
    
    /**
     * Cómo revolver las fichas
     * @param numTokens
     * @return 
     */
    public List obtainTokens(int numTokens)
    {
        List fichasExtraidas = null;
        for(int i = 0;numTokens>i;i++)
        {
            int numRandom = obtenerNumeroRandom(0,TokenList.size());
            fichasExtraidas.add(TokenList.get(numRandom));
            TokenList.remove(numRandom);
        }
        return fichasExtraidas;
    }
    
    
    
    /**
     * Asignar a jugador correspondiente
     * @param TokenList 
     * @param id 
     */
    public void assignTokensToPlayer(List TokenList, int id)
    {
        int posicionJugador = -1;
        for(int i = 0;players.size()>i;i++)
        {
            if(players.get(i).getId() == id)
            {
                posicionJugador = i;
            }
        }
        players.get(posicionJugador).setTokenList(TokenList);
        
    };
    
    public void assignRemainingTokensToPond()
    {
        board.getPond().assignTokensToPond((Token) TokenList);
    };
    
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
    
    public void returnTokensToPond(List<Token> tokenList){

        for(Token pieza:tokenList)
        {
            board.getPond().addTokenToPond(pieza);
        }
        
    }
    
    /**
     * Verificar si el jugador está activo en la partida.
     * @param player 
     */
    public void playerStateToInactive(Player player){};
    
    
    public int obtenerNumeroRandom(int min, int max)
    {
        int n =(int)(Math.random() * (max - min)) + min;
        
        return n;
    }
    
}