/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import org.itson.Domain.Board;
import org.itson.Domain.Game;
import org.itson.Domain.Token;
import org.itson.frames.FrmLobby;

/**
 *
 * @author aleja
 */
public class ServerConnection implements Runnable {

    private final int PUERTO = 9192;
    private final String HOST = "localhost";
    private Socket socket;
    private DataOutputStream salida;
    private ObjectInputStream in;
    private DataInputStream entrada;
    private String mensaje;
    private Game juego;
    private Board tablero;
    private int id;
    private Constantes con;
    private boolean turno;

    public ServerConnection(Game juego) {
        try {
            this.juego = juego;
            this.tablero = new Board(PUERTO, PUERTO);
            con = new Constantes();
            socket = new Socket(HOST, PUERTO);
            entrada = new DataInputStream(socket.getInputStream());
            salida = new DataOutputStream(socket.getOutputStream());
            System.out.println("Conectado al servidor: " + socket.getInetAddress() + " En el puerto: " + socket.getPort());
        } catch (IOException e) {
            System.out.println("Error al conectar con el servidor... " + e.getMessage());
        }
    }

    @Override
    public void run() {

        while (true) {
            try {
                mensaje = entrada.readUTF();
                System.out.println(mensaje);
                String split[] = mensaje.split(";");
                if (split[0].equals("ID")) {
                    this.id = Integer.valueOf(split[1]);
                    System.out.println(id);
                } else if (split[0].equals(con.ESPERA)) {
                    System.out.println("Faltan jugadores");
                } else if (split[0].equals(con.JUGAR)) {
                    System.out.println("Comienza partida");
                    this.enviaMensaje("3");
                } else if (split[0].equals("4")) {
                    if (split[15].equals(String.valueOf(this.id))) {
                        //setFichasJugador(message);
                    }
                } else if (split[0].equals("5")) {
                    if (tablero.addTokenToBoard(new Token(Integer.valueOf(split[2]), Integer.valueOf(split[3])), Integer.valueOf(split[4]))) {
                        System.out.println("el id es: " + split[1]);
                        System.out.println("Este id es: " + this.id);
                        if (Integer.valueOf(split[1]) == this.id) {
                            turno = true;
                            System.out.println("tu turno");
                        }
                    } else {
                        if (!(Integer.valueOf(split[1]) == this.id)) {
                            System.out.println("No se puede poner la ficha");
                            turno = true;
                        }
                    }

                } else if (split[0].equals("6")) {
                    if (Integer.valueOf(split[1]) == this.id) {
                        turno = true;
                        System.out.println("tu turno");
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
    
    private boolean seguir = false;
    public boolean seguirJugando(){
        return seguir;
    }

    public void enviaMensaje(String envia) {
        try {
            salida.writeUTF(envia);
        } catch (IOException e) {
            System.out.println("No se pudo enviar mensaje");
        }
    }

    public void pasarTurno() {
        turno = !turno;
        mensaje = "6" + ";" + this.id;
        enviaMensaje(mensaje);
    }

    public boolean enviaMovimiento(Token token, int lugar) {
        if (turno) {
            mensaje = "4" + ";" + this.id + ";" + String.valueOf(token.getUpperSide()) + ";" + String.valueOf(token.getLowerSide()) + ";" + lugar;
            try {
                salida.writeUTF(mensaje);
                return true;
            } catch (IOException ex) {
                Logger.getLogger(ServerConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("No es tu turno");
        }
        return false;
    }

    public String mensaje() {
        return mensaje;
    }

    public Board getTablero() {
        return tablero;
    }

    public boolean getTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }


}
