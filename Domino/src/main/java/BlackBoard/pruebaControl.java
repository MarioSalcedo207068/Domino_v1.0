
package BlackBoard;

import org.itson.Domain.Game;

/**
 *
 * @author PC
 */
public class pruebaControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
           
    Game juego = new Game();
    Control ctrl = new Control(juego);
    
    juego.addObserver(ctrl);
    ctrl.llamadoExpertos(null, null, 3);
    
    
    }
    
}
