
package org.itson.Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author aleja
 */
public class Server {
    private final int PUERTO = 9192;
    private final int CONEXIONES = 4;
    private ServerSocket ss;
    private HiloServer hiloServer;
    private serverComunication com;
    private int players;

    public Server() {
    }

    public void start() {
        try {
            ss = new ServerSocket(PUERTO, CONEXIONES);
            System.out.println("Server initialized");
            System.out.println("Waiting for players...");
            com = new serverComunication();
            players = 0;
            while (true) {
                Socket socket = ss.accept();
                players++;
                com.setPlayers(players);
                System.out.println("Player logged in: " + socket.getInetAddress());
                //AQUí SE APLICAN HILOS
                hiloServer = new HiloServer(socket, com, players);
                Thread hilo = new Thread(hiloServer);
                hilo.start();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) 
    {
        Server server = new Server();
        server.start();
    }

}