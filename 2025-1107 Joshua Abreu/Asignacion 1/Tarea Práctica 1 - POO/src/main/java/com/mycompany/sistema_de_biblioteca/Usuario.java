/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Joshua Abreu
 */
public class Usuario {
     // Nombre del usuario
    private String nombre;
    
    // ID unico
    private int ID;
    
    // Lista de libros que el usuario tiene actualmente prestados
    private ArrayList<Libro> librosPrestados;
    
     /**
     * Constructor que crea un usuario con su nombre e ID.
     * Inicializa la lista de libros prestados como vacía.
     * 
     * @param nombre nombre del usuario
     * @param ID identificador único del usuario
     */
    Usuario(String nombre, int ID){
        this.nombre = nombre;
        this.ID = ID;
       librosPrestados = new ArrayList<>(); // Crea una lista vacía para almacenar los libros prestados
    }
   
     /**
     * Permite al usuario pedir un libro.
     * Si el libro está disponible, se marca como prestado
     * y se agrega a la lista de libros del usuario.
     * 
     * @param libro libro que el usuario desea pedir
     */
    public void pedirLibro(Libro libro){
        if(libro.estaDisponible()){ // Verifica si el libro está disponible
            libro.prestarLibro();
            librosPrestados.add(libro); // Agrega el libro a la lista de libros prestados del usuario
            System.out.println(nombre + " presto el libro: " + libro.getTitulo() + ", del autor: " + libro.getAutor());
        }else{
            System.out.println("Libro no disponible");
        }
    }    
    
    /**
     * Permite al usuario devolver un libro.
     * Si el usuario tiene el libro en su lista de préstamos,
     * se elimina de la lista y el libro se marca como disponible.
     * 
     * @param libro libro que el usuario desea devolver
     */
    public void devolverLibro(Libro libro){
        if(librosPrestados.contains(libro)){ // Verifica si el usuario tiene ese libro en su lista de prestados
            librosPrestados.remove(libro); // Elimina el libro de la lista de libros prestados
            libro.devolverLibro();
            System.out.println(nombre + " devolvio el libro: " + libro.getTitulo() + ", del libro: " + libro.getAutor());
        }
    }
      
}
