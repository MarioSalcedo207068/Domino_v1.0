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
    
    private DataOutputStream salida;
    private DataInputStream entrada;
    private Socket cliente;
    private serverComunicacion com;
    private boolean running = true;
    private int listos = 0;
    private String mensajeCliente;
    private Constantes con;
    private int id;
    
    public HiloServer(Socket cliente, serverComunicacion com, int id) {
        this.cliente = cliente;
        this.com = com;
        this.id = id;
        con = new Constantes();
    }
    
    @Override
    public void run() {
        try {
            entrada = new DataInputStream(cliente.getInputStream());
            salida = new DataOutputStream(cliente.getOutputStream());
            com.addObserver(this);
            //Envia id
            String enviaID = "ID;" + String.valueOf(id);
            salida.writeUTF(enviaID);
            //Ciclo para recibir los mensajes del cliente
            while (running) {
                mensajeCliente = entrada.readUTF();
                mensaje(mensajeCliente);
            }
        } catch (IOException ex) {
            running = false;
            System.out.println("Un jugador se ha desconectado.");
        }
    }
    
    public void mensaje(String mensaje) {
        //Procesa el mensaje recibido
        //accion;
        try {
            String split[] = mensaje.split(";");
            if (split[0].equals(con.LISTO)) {
                com.setPlayersReady(com.getPlayersReady() + 1);
                listos = com.getPlayersReady();
                System.out.println(listos);
                if (listos == 2) {
                    mensajeCliente = con.JUGAR;
                    com.setMessage(mensajeCliente);
                } else {
                    mensajeCliente = con.ESPERA;
                    com.setMessage(mensajeCliente);
                }
            } else if (split[0].equals("3")) {
                String reparte = com.repartirFichas(id);
                //4;listafichasJugador1;idJugador
                mensajeCliente = "4" + reparte + ";" + id;
                salida.writeUTF(mensajeCliente);
            } else if (split[0].equals("4")) {
                System.out.println("Entro a 4: poner ficha");
                
                System.out.println("Si se manda mensaje");
                if (split[1].equals("1")) {
                    mensajeCliente = "5" + ";" + "2" + ";" + split[2] + ";" + split[3] + ";" + split[4];
                } else {
                    mensajeCliente = "5" + ";" + "1" + ";" + split[2] + ";" + split[3] + ";" + split[4];
                }                
                com.setMessage(mensajeCliente);
                
            } else if (split[0].equals("6")) {
                if (Integer.valueOf(split[1]) == 1) {
                    mensajeCliente = "6;" + "2";
                } else {
                    mensajeCliente = "6;" + "1";
                }
                com.setMessage(mensajeCliente);
            }
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void update(Observable o, Object arg) {
        try {
            String update = (String) arg;
            salida.writeUTF(update);
        } catch (IOException e) {
        }
    }
    
}