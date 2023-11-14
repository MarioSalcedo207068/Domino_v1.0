/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Interfaces;



/**
 *
 * @author Equipo 02
 */
public interface iGame 
{
    
    public void register(Observer ob);
    public void unregister(Observer ob);
    public void notifyObserver();
    
}
