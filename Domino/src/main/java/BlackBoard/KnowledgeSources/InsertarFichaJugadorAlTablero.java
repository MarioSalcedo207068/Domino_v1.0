/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackBoard.KnowledgeSources;

import org.itson.Domain.Board;
import org.itson.Domain.Estados;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.playerToken;

/**
 *
 * @author Equipo 02
 */
public class InsertarFichaJugadorAlTablero implements KnowledgeSource <playerToken,Player> {
    
    private Game game;
    public InsertarFichaJugadorAlTablero(Game game)
    {
        this.game = game;
    }
    /*public boolean addPrimerFicha(playerToken token) {
        //Verifica que sea la mula de 6
        if (token.getUpperSide()== 6 && token.getLowerSide() == 6) {
            token.x = canvas.getWidth() / 2;
            token.y = canvas.getHeight() / 2;
            board.primera = token;
            board.ultima = token;
            board.mula5 = token;
            board.primeraArriba = board.mula5;
            board.ultimaAbajo = board.mula5;
            canvas.pintar(token);
            return true;
        } else {
            System.out.println("La primera ficha debe ser la mula de 5");
            return false;
        }
    }*/
    
    @Override
    public void update(playerToken fichaJugador, Player jugador) 
    {
        int idJugador = 0;
        for(Player players : game.getPlayers())
        {
            if(players.getId() == jugador.getId())
            {
                idJugador = players.getId();
                players.removeToken(fichaJugador);
                game.getBoard().addTokenToBoard(fichaJugador);
                break;
            }
        }
        game.setEstadoJuego(Estados.FICHAS_INSERTADAS_TABLERO);
        
        game.setObservableChanged();
        game.notifyObservers(idJugador);
    }


    
    
}
