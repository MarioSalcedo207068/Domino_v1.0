/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Interfaces;

import org.itson.Domain.Game;

/**
 *
 * @author Equipo 02
 */
public interface ChangeManager 
{
    
    public void register(Game game, Observer ob);
    public void unregister(Game game, Observer ob);
    public void Notify();
    
}
