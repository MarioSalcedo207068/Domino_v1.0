/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.Domain;

/**
 *
 * @author Equipo 02
 */
public enum Estados 
{
    
    
    EN_ESPERA,
    ASIGNAR_FICHA, //AsignarFichasAJugador 
    FICHA_VALIDA, //ValidarFichaTablero1
    FICHA_INVALIDA, //ValidarFichaTablero2
    PUNTUACIONES_CALCULADO, //CalcularScoreJugadores
    JUEGO_ACTIVO, //Estado Neutral del juego
    FICHAS_DEVUELTAS_POZO, //DevolverFichasAlPozo
    FICHAS_INSERTADAS_TABLERO, //InsertarFichaJugadorAlTablero
    JUGADOR_SIN_FICHAS,//VerificarCantidadFichasJugador1
    JUGADOR_CON_FICHAS,//VerificarCantidadFichasJugador2
    JUGADOR_FICHA_POZO,//ObtenerFichaDelPozo
    ;
    
    
}
