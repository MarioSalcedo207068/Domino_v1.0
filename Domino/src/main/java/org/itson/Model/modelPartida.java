
package org.itson.Model;

import BlackBoard.Control;
import java.util.Dictionary;
import java.util.List;
import org.itson.Domain.BoardToken;
import org.itson.Domain.Estados;
import static org.itson.Domain.Estados.ASIGNAR_FICHA;
import static org.itson.Domain.Estados.EN_ESPERA;
import static org.itson.Domain.Estados.FICHAS_DEVUELTAS_POZO;
import static org.itson.Domain.Estados.FICHAS_INSERTADAS_TABLERO;
import static org.itson.Domain.Estados.FICHA_INVALIDA;
import static org.itson.Domain.Estados.FICHA_VALIDA;
import static org.itson.Domain.Estados.PUNTUACIONES_CALCULADO;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.Token;
import org.itson.Domain.playerToken;
import org.itson.Interfaces.iModelPartida;


/**
 *
 * @author Equipo 02
 */
public class modelPartida implements iModelPartida{
    private Game game;
    Control control;

    public modelPartida(Game game,Control control)
    {
        this.game = game;
        this.control = control;
    }    
    
    public modelPartida(Game game)
    {
        this.game = game;
        control = new Control(this.game);
    }
    
    public modelPartida()
    {
        control = new Control();
    }
    

    public void endCurrentTurn()
    {
        game.setEstadoJuego(Estados.JUEGO_ACTIVO);
    }
    
    public void getHighestMule()
    {

        
        Token token = null;
        token.setLowerSide(0);
        token.setUpperSide(0);
        int playerPosition = -1;
        
        for(int i = 0;i<game.getPlayers().size();i++)
        {
            if(game.getPlayers().get(i).highestMule() > 0)
            {
                int positionOfHighestMule = game.getPlayers().get(i).highestMule();
                if(game.getPlayers().get(i).getTokenList().get(positionOfHighestMule).getSumaFicha() > token.getSumaFicha())
                {
                    playerPosition = i;
                    token = game.getPlayers().get(i).getTokenList().get(positionOfHighestMule);
                }
            }
        }
        
        game.getBoard().addTokenToBoard(token);
        game.getPlayers().get(playerPosition).removeToken(token);
        
        
    }
    
    
    public void returnTokensToPond(Player player)
    {
        Player playerToRemove = null;
        for(int i = 0; i>game.getPlayers().size();i++)
        {
            if(game.getPlayers().get(i).getId() == player.getId())
            {
                playerToRemove = game.getPlayers().get(i);
                break;
            }
        }
        
        game.getBoard().getPond().addTokensToPond(playerToRemove.getTokenList());
        
    }

    @Override
    public String obtainPlayerName(int id) 
    {
        Player p;
        p = game.obtainPlayerInfo(id);
        return p.getName();
    }

    @Override
    public String obtainPlayerAvatar(int id) 
    {
        Player p;
        p = game.obtainPlayerInfo(id);
        return p.getAvatar();
    }

    @Override
    public int obtainPondNumberOfTokens() 
    {
        return game.getBoard().getPond().getNumOfTokens();
    }



    @Override
    public List<BoardToken> obtainBoardTokenList() 
    {
        return game.getBoard().getTokenList();
    }

    @Override
    public List<playerToken> obtainPlayerTokenList(int id) {
        Player p;
        p = game.obtainPlayerInfo(id);
        return p.getTokenList();
    }

    @Override
    public int obtainPlayerNumberOfTokens(int id) 
    {
        Player p;
        p = game.obtainPlayerInfo(id);
        return p.getTokenList().size();
    }

    @Override
    public Estados obtainGameState() {
        return game.getEstadoJuego();
    }
    
    public void setGame(Game game)
    {
        this.game = game;
        control = new Control(this.game);
    }

    public Game getGame() {
        return game;
    }
    
    public void verifyGameState(Object a, Object b)
    {
        Estados e = game.getEstadoJuego();
        
        switch (e)
        {
            case EN_ESPERA:
                
            break;
            
            case ASIGNAR_FICHA:
            break;
            
            case FICHA_VALIDA:
            break;
            
            case FICHA_INVALIDA:
            break;
            
            case PUNTUACIONES_CALCULADO:
            break;
            
            case FICHAS_DEVUELTAS_POZO:
            break;
            
            case FICHAS_INSERTADAS_TABLERO:
            break;
             
        }
    }
    
    
    //INICIO LLAMADO DE LOS EXPERTOS DE CONTROL
    
    public void assignTokensToPlayer(Integer cantidadFichas, Integer idJugador)
    {
        control.llamadoExpertos(cantidadFichas, idJugador, 0);
        setGame(control.getGame());
    }
    
    public void returnTokensFromPlayerToPond(Integer idJugador)
    {
        control.llamadoExpertos(idJugador, null, 0);
        setGame(control.getGame());        
    } 
    
    public void validateTokenBoard(Token tokenToPlace, Player player, boolean side)
    {
        control.llamadoExpertos(tokenToPlace, side, 4);
        setGame(control.getGame());
    }
    
    public void verifyTokensFromPond(Player player)
    {
        
        if(game.getBoard().getPond().emptyPondTokenList())
        {
            //ERROR HACIA EL PRESENTER QUE REFLEJE QUE NO HAY FICHAS EN EL POZO
        }
        else
        {
            control.llamadoExpertos(player.getId(), null, 5);
            setGame(control.getGame());            
        }
        
    }
    
    
    
    //FIN LLAMADO DE LOS EXPERTOS DE CONTROL
    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;

    }

    
    
    

    @Override
    public List<Dictionary> obtainScores() 
    {
        return game.getScoreList();
    }
    
    

    
}
