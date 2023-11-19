/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackBoard;

import org.itson.Domain.Game;
import org.itson.Interfaces.ChangeManager;
import java.util.Observer;
import org.itson.Observer.IObserver;

/**
 *
 * @author Equipo 02
 */
public class SimpleChangeManager implements ChangeManager {

    @Override
    public void Notify() 
    {
        
    }

    @Override
    public void register(Game game, IObserver ob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void unregister(Game game, IObserver ob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
