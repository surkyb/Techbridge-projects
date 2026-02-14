/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_biblioteca;

/**
 *
 * @author Joshua Abreu
 */
public class Prestamo {
    // Fecha en la que se realizó el préstamo
    private String fecha;
    private Libro libro;
    // Usuario que realizó el préstamo
    private Usuario usuario;
    
     /**
     * Constructor que crea un préstamo con su información básica.
     * 
     * @param fecha fecha en la que se realizó el préstamo
     * @param libro libro que fue prestado
     * @param usuario usuario que realizó el préstamo
     */
    Prestamo(String fecha, Libro libro, Usuario usuario){
        this.fecha = fecha;
        this.libro = libro;
        this.usuario = usuario;
    }
}
