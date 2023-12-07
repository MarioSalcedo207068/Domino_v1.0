/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author aleja
 */
public class HiloServer implements Runnable, Observer {
    
    private DataOutputStream output;
    private DataInputStream in;
    private Socket client;
    private serverComunication com;
    private boolean running = true;
    private int ready = 0;
    private String ClientMessage;
    private Const con;
    private int id;
    
    public HiloServer(Socket cliente, serverComunication com, int id) {
        this.client = cliente;
        this.com = com;
        this.id = id;
        con = new Const();
    }
    
    @Override
    public void run() {
        try {
            in = new DataInputStream(client.getInputStream());
            output = new DataOutputStream(client.getOutputStream());
            com.addObserver(this);
            String enviaID = "ID;" + String.valueOf(id);
            output.writeUTF(enviaID);
            while (running) {
                ClientMessage = in.readUTF();
                mensaje(ClientMessage);
            }
        } catch (IOException ex) {
            running = false;
            System.out.println("Player disconnected");
        }
    }
    
    public void mensaje(String mensaje) {
        try {
            String split[] = mensaje.split(";");
            if (split[0].equals(con.READY)) {
                com.setPlayersReady(com.getPlayersReady() + 1);
                ready = com.getPlayersReady();
                System.out.println(ready);
                if (ready == 2) {
                    ClientMessage = con.PLAY;
                    com.setMessage(ClientMessage);
                } else {
                    ClientMessage = con.WAIT;
                    com.setMessage(ClientMessage);
                }
            } else if (split[0].equals("3")) {
                String handOut = com.repartirFichas(id);
                ClientMessage = "4" + handOut + ";" + id;
                output.writeUTF(ClientMessage);
            } else if (split[0].equals("4")) {
                System.out.println("Place token");
                
                System.out.println("Message sent!");
                if (split[1].equals("1")) {
                    ClientMessage = "5" + ";" + "2" + ";" + split[2] + ";" + split[3] + ";" + split[4];
                } else {
                    ClientMessage = "5" + ";" + "1" + ";" + split[2] + ";" + split[3] + ";" + split[4];
                }                
                com.setMessage(ClientMessage);
                
            } else if (split[0].equals("6")) {
                if (Integer.valueOf(split[1]) == 1) {
                    ClientMessage = "6;" + "2";
                } else {
                    ClientMessage = "6;" + "1";
                }
                com.setMessage(ClientMessage);
            }
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void update(Observable o, Object arg) {
        try {
            String update = (String) arg;
            output.writeUTF(update);
        } catch (IOException e) {
        }
    }
    
}