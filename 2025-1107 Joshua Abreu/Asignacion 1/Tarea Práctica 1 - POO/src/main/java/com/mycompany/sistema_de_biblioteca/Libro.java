/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_de_biblioteca;

/**
 *
 * @author Joshua Abreu
 */
public class Libro {
    // Atributo que almacena el título del libro
    private String titulo;
    // Atributo que almacena el nombre del autor
    private String autor;
    // Atributo que almacena el ISBN del libro (identificador único)
    private int ISBN;
    // Atributo para saber si el libro está disponible
    private boolean disponible;
    
    /**
     * Constructor que crea un libro con su información básica.
     * El libro se crea inicialmente como disponible.
     * 
     * @param titulo título del libro
     * @param autor nombre del autor del libro
     * @param ISBN número ISBN del libro
     */
    Libro(String titulo, String autor, int ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true;
    }
    
     /**
     * Obtiene el título del libro.
     * 
     * @return título del libro
     */
    public String getTitulo(){
        return titulo;
    }
    
     /**
     * Obtiene el autor del libro.
     * 
     * @return autor del libro
     */
    public String getAutor(){
        return autor;
    }
    
      /**
     * Indica si el libro está disponible para préstamo.
     * 
     * @return true si el libro está disponible, false si está prestado
     */
    public boolean estaDisponible(){
        return disponible;
    }
    
    // Marca el libro como prestado si está disponible
    public void prestarLibro(){
        if(disponible){
            disponible = false;
        }
    }
    
    // Marca el libro como devuelto
    public void devolverLibro(){
        disponible = true;
    }     
}
