/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Sockets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;

/**
 *
 * @author aleja
 */
public class serverComunicacion extends Observable{
    
    private String message;
    private int players = 0;
    private int playersReady = 0;
    private ArrayList<String> lista = fichas();
    
    public serverComunicacion(){
       
    }
    
    public void setMessage(String mensaje){
        this.message = mensaje;
        this.setChanged();
        this.notifyObservers(getMessage());
    }
    
    public String getMessage(){
        return message;
    }
    
    public void setPlayers(int jugadores){
        this.players = jugadores;
    }
    
    public int getPlayers(){
        return players;
    }

    public int getPlayersReady() {
        return playersReady;
    }

    public void setPlayersReady(int playersReady) {
        this.playersReady = playersReady;
    }
    
    public String repartirFichas(int id) {
        String fichas = "";
        if (id == 1) {
            for (int i = 0; i < 14; i++) {
                fichas += ";" + lista.get(i);
            }

            for (int i = 0; i < 14; i++) {
                lista.remove(0);
            }
        } else if (id == 2) {
            for (int i = 0; i < 14; i++) {
                fichas += ";" + lista.get(i);
            }

            for (int i = 0; i < 14; i++) {
                lista.remove(0);
            }
        }

        return fichas;
    }
    
    public ArrayList<String> fichas(){
        lista = new ArrayList();
        lista.add("0-0");
        lista.add("1-0");
        lista.add("1-1");
        lista.add("2-0");
        lista.add("2-1");
        lista.add("2-2");
        lista.add("3-0");
        lista.add("3-1");
        lista.add("3-2");
        lista.add("3-3");
        lista.add("4-0");
        lista.add("4-1");
        lista.add("4-2");
        lista.add("4-3");
        lista.add("4-4");
        lista.add("5-0");
        lista.add("5-1");
        lista.add("5-2");
        lista.add("5-3");
        lista.add("5-4");
        lista.add("5-5");
        lista.add("6-0");
        lista.add("6-1");
        lista.add("6-2");
        lista.add("6-3");
        lista.add("6-4");
        lista.add("6-5");
        lista.add("6-6");

        Collections.shuffle(lista);

        return lista;
    }
    
}
