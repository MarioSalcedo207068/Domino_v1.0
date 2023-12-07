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

    private final int PUERTO = 9000;
    private final String HOST = "localhost";
    private Socket socket;
    private DataOutputStream output;
    private ObjectInputStream in;
    private DataInputStream dataIn;
    private String message;
    private Game game;
    private Board board;
    private int id;
    private Const con;
    private boolean turn;

    public ServerConnection(Game juego) {
        try {
            this.game = juego;
            this.board = new Board(PUERTO, PUERTO);
            con = new Const();
            socket = new Socket(HOST, PUERTO);
            dataIn = new DataInputStream(socket.getInputStream());
            output = new DataOutputStream(socket.getOutputStream());
            System.out.println("Connects to server: " 
                    + socket.getInetAddress() 
                    + " PORT: " 
                    + socket.getPort());
        } catch (IOException e) {
            System.out.println("Cannot connect to server! " + e.getMessage());
        }
    }

    @Override
    public void run() {

        while (true) {
            try {
                message = dataIn.readUTF();
                System.out.println(message);
                String split[] = message.split(";");
                if (split[0].equals("ID")) {
                    this.id = Integer.valueOf(split[1]);
                    System.out.println(id);
                } else if (split[0].equals(con.WAIT)) {
                    System.out.println("WAITING FOR PLAYERS");
                } else if (split[0].equals(con.PLAY)) {
                    System.out.println("START GAME");
                    this.enviaMensaje("3");
                } else if (split[0].equals("4")) {
                    if (split[15].equals(String.valueOf(this.id))) {
                    }
                } else if (split[0].equals("5")) {
                    if (board.addTokenToBoard(new Token(Integer.valueOf(split[2]), Integer.valueOf(split[3])), Integer.valueOf(split[4]))) {
                        System.out.println("ID: " + split[1]);
                        if (Integer.valueOf(split[1]) == this.id) {
                            turn = true;
                            System.out.println("Your Turn!!");
                        }
                    } else {
                        if (!(Integer.valueOf(split[1]) == this.id)) {
                            System.out.println("Cannot place token");
                            turn = true;
                        }
                    }

                } else if (split[0].equals("6")) {
                    if (Integer.valueOf(split[1]) == this.id) {
                        turn = true;
                        System.out.println("Your Turn!!");
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
            output.writeUTF(envia);
        } catch (IOException e) {
            System.out.println("Message not sent!!");
        }
    }

    public void pasarTurno() {
        turn = !turn;
        message = "6" + ";" + this.id;
        enviaMensaje(message);
    }

    public boolean enviaMovimiento(Token token, int lugar) {
        if (turn) {
            message = "4" + ";" + this.id + ";" + String.valueOf(token.getUpperSide()) + ";" + String.valueOf(token.getLowerSide()) + ";" + lugar;
            try {
                output.writeUTF(message);
                return true;
            } catch (IOException ex) {
                Logger.getLogger(ServerConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Not your turn");
        }
        return false;
    }

    public String message() {
        return message;
    }

    public Board getBoard() {
        return board;
    }

    public boolean getTurno() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }


}
