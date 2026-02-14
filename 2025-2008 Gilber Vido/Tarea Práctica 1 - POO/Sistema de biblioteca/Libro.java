/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_biblioteca;

/**
 *
 * @author Gilber Vido
 */
public class Libro {
    
    /**
     * Aqui procedo a crear los atributos
     */
    
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;
    
    //Este es el constructor//
    public Libro(String titulo, String autor, String ISBN)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true; 
    }
    
    /**
     * Este metodo es para consultar la disponiblidad del libro
     */
    public boolean disponibilidadLibro()
    {
        return disponible;
    }
    
    /**
     * Este metodo es para marcar que esta prestado
     */
    public void marcarPrestado()
    {
        this.disponible = false;
    }
    
    /**
     * Este metodo es para marcar que esta disponible
     */
    public void marcarDisponible()
    {
        this.disponible = true;
    }
    
    
    /**
     * estos metodos son para poder recibir parametros
     * @return 
     */
    public String gettitulo()
    {
        return titulo;
    }
    
    public String getISBN()
    {
        return ISBN;
    }
}
