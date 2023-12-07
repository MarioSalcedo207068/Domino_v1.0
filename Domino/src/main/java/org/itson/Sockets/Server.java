
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
    private HiloServer servidor;
    private serverComunicacion com;
    private int jugadores;

    public Server() {
    }

    public void iniciar() {
        try {
            //Se crea el servidor con un max de 4 jugadores
            ss = new ServerSocket(PUERTO, CONEXIONES);
            System.out.println("Iniciando servidor.");
            System.out.println("Esperando jugadores...");
            com = new serverComunicacion();
            jugadores = 0;
            //Bucle infinito para recibir jugadores nuevos
            while (true) {
                //Se acepta al jugador
                Socket socket = ss.accept();
                jugadores++;
                com.setPlayers(jugadores);
                System.out.println("Se conecto: " + socket.getInetAddress());
                //Hilo para el nuevo jugador
                servidor = new HiloServer(socket, com, jugadores);
                Thread hilo = new Thread(servidor);
                hilo.start();
                
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) 
    {
        Server server = new Server();
        server.iniciar();
    }

}