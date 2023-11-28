/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import org.itson.Presenter.presenterMenu;
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
        FrmInicio frame = new FrmInicio(pm);
        frame.setVisible(true);
    }
    
}
