/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.Model;

import BlackBoard.Control;
import java.util.LinkedList;
import java.util.List;
import org.itson.Domain.Estados;
import static org.itson.Domain.Estados.FICHAS_INSERTADAS_TABLERO;
import org.itson.Domain.Game;
import org.itson.Domain.Player;
import org.itson.Domain.Token;
import org.itson.Domain.playerToken;
import org.itson.Presenter.presenterPartida;

/**
 *
 * @author PC
 */
public class pruebasModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Game game = new Game();
    
    List<Player> p = new LinkedList<>();
    Player j = new Player();
    Player j2= new Player();
    
    j.setName("JUAN");
    j2.setName("PEDRO");
    
    playerToken t = new playerToken(1,1);

    
    playerToken t2 = new playerToken(2,2);
    
    
    j.addToken(t);
    j2.addToken(t2);
    p.add(j);
    p.add(j2);
    
    playerToken t3 = t2;
    game.setPlayers(p);
    
    Player show = game.searchTokenInPlayer(t3);
    System.out.println(show.getName());
    game.setEstadoJuego(Estados.FICHAS_INSERTADAS_TABLERO);

//    

    presenterPartida pp = new presenterPartida();
    Control ctrl = new Control(game);
    modelPartida model = new modelPartida(game);
    pp.setCtrl(ctrl);
    pp.setModel(model);
    
    pp.getModel().getControl().actualizacion(null);
    
    }
    
}
