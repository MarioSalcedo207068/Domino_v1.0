
package org.itson.Domain;

/**
 *
 * @author aleja
 */
public class Token {
    private int upperSide;
    private int lowerSide;
    
    public boolean isMule()
    {
        return upperSide==lowerSide;
    }

    public int getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(int upperSide) {
        this.upperSide = upperSide;
    }

    public int getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(int lowerSide) {
        this.lowerSide = lowerSide;
    }
    
    
}
