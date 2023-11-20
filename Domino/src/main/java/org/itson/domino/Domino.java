/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.domino;

import java.util.LinkedList;
import java.util.List;
import org.itson.Domain.Player;
import org.itson.Presenter.presenterInicio;

/**
 *
 * @author Equipo 02
 */
public class Domino {

    public static void main(String[] args) 
    
    {       List l;
        Player j1 = new Player();
        j1.setId(1);
        Player j2 = j1;
        l = new LinkedList<Player>();
        l.add(j1);
        System.out.println(j1.equals(j2));
        
        Player j3 = (Player) l.get(0);
        
        System.out.println(j3.getId());
        
        System.out.println(j1.equals(j3));
        presenterInicio presenter = new presenterInicio();
        presenter.setVisibleInicio();

    }
}
