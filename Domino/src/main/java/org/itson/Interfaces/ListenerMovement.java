/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Interfaces;

import java.util.EventListener;

/**
 *
 * @author aleja
 */
public interface ListenerMovement extends EventListener{
    
    public void onMovimientoFicha(ListenerMovement e);
    
    public void onPasarTurno();
    
}