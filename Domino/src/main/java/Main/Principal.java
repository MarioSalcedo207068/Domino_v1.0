
package Main;

import org.itson.Presenter.presenterMenu;
import org.itson.drawClass.Canvas;
import org.itson.frames.FrmInicio;

/**
 *
 * @author PC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        presenterMenu pm = new presenterMenu();
        FrmInicio frm = new FrmInicio(pm);
        frm.setVisible(true);
        
    }
 
}
