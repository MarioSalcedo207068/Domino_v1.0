/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Observer;

/**
 *
 * @author aleja
 */
public interface IObservable {
   public void add(IObserver o);
   public void remove(IObserver o);
   public void notificar();
}
