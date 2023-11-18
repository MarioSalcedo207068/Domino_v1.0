
package org.itson.Domain;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Equipo 02
 */
public class Token {
    /**
     * Este se cambió por practicidad para indicar el upperSide de la ficha.
     */
	private int head;
     /**
     * Este se cambió por practicidad para indicar el lowerSide de la ficha.
     */
	private int tail;
    /**
     * De igual manera se agregó isDouble como booleano para determinar si una ficha era doble o no.
     */
        private boolean isDouble;
        
    /**
    * Inicializa a Token para determinar si es doble o no.
    * @param upperSide
    * @param lowerSide
    */
        public Token(int upperSide, int lowerSide){
            this.head = upperSide;
            this.tail = lowerSide;
            isDouble = (upperSide == lowerSide);
	}
    /**
     * Método booleano para identificar si es mula o no.
     * @return true si head es igual a tail. false si no es así.
     */
    public boolean isMule()
    {
        return head==tail;
    }
    /**
     * Método int para conseguir la ficha con el valor de arriba
     * @return el valor de la parte superior de la ficha 
     */
    public int getUpperSide() {
        return head;
    }

    public void setUpperSide(int upperSide) {
        this.head = upperSide;
    }
    /**
     * Método int para conseguir la ficha con el valor de arriba
     * @return el valor de la parte inferior de la ficha 
     */
    public int getLowerSide() {
        return tail;
    }

    public void setLowerSide(int lowerSide) {
        this.tail = lowerSide;
    }
	
    /**
     * Método nuevo para determinar el valor total de la ficha, sumando tanto la parte superior como la inferior.
     */
    	public int getSumaFicha(){
		return tail+head;
	}
	
	/**
	 * Regresa un boolean representando si la ficha es doble o no.
	 * @return true si es doble, false en caso contrario.
	 */
	public boolean isDouble(){
		return isDouble;
	}
	


}