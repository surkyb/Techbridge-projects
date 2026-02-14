/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_biblioteca;

/**
 *
 * @author Joshua Abreu
 */
public class Prueba {
    public static void main(String[] args) {
        // Se crea un libro con su título, autor e ISBN
        Libro libro1 = new Libro("La vida de Lazarillo de Tormes", "Anonimo", 227891);
         // Se crea un usuario con nombre e ID
        Usuario usuario1 = new Usuario("Joshua", 1);
        
         // Se crea otro libro diferente
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes", 358001);
         // Se crea otro usuario diferente
        Usuario usuario2 = new Usuario("Julio", 2);
        
        // El usuario1 pide el libro1
        usuario1.pedirLibro(libro1);
        
        // El usuario1 devuelve el libro1
        usuario1.devolverLibro(libro1);
        
        // El usuario2 pide el libro2
        usuario2.pedirLibro(libro2);
        
        // El usuario2 devuelve el libro2
        usuario2.devolverLibro(libro2);
    }
}
