
package org.itson.Domain;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Equipo 02
 */
public class Token 
{
    /**
     * EXTRAS pruebas
     */
    public int x,y;
    public BufferedImage img;
    public String dir;
    public int rotation;
    public int visible;

    
    /**
     * Este se cambió por practicidad para indicar el upperSide de la ficha.
     */
	private Integer head;
     /**
     * Este se cambió por practicidad para indicar el lowerSide de la ficha.
     */
	private Integer tail;
    /**
     * De igual manera se agregó isDouble como booleano para determinar si una ficha era doble o no.
     */
        private boolean isDouble;
        
    /**
    * Inicializa a Token para determinar si es doble o no.
    * @param upperSide
    * @param lowerSide
    */
        public Token(Integer upperSide, Integer lowerSide){
            this.head = upperSide;
            this.tail = lowerSide;
            isDouble = (upperSide == lowerSide);
	}

    /**
     * Método int para conseguir la ficha con el valor de arriba
     * @return el valor de la parte superior de la ficha 
     */
    public Integer getUpperSide() {
        return head;
    }

    public void setUpperSide(Integer upperSide) {
        this.head = upperSide;
    }
    /**
     * Método int para conseguir la ficha con el valor de arriba
     * @return el valor de la parte inferior de la ficha 
     */
    public Integer getLowerSide() {
        return tail;
    }

    public void setLowerSide(Integer lowerSide) {
        this.tail = lowerSide;
        
            
        }


    /**
     * Método nuevo para determinar el valor total de la ficha, sumando tanto la parte superior como la inferior.
     * @return
     */
    public Integer getSumaFicha()
    {
        return tail+head;
    }
	
	/**
	 * Regresa un boolean representando si la ficha es doble o no.
	 * @return true si es doble, false en caso contrario.
	 */
    public boolean isDouble()
    {
        return isDouble;
    }
	
    



}