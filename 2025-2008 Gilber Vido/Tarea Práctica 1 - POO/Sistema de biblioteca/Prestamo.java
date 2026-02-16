/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_biblioteca;

import java.time.LocalDate;

/**
 *
 * @author Gilber Vido
 */
public class Prestamo {
    
    /**
     * Aqui declaramos los parametros de esta clase
     */
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;
    
    //Este es el constructor
    public Prestamo(Usuario usuario, Libro libro)
    {
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }
    
    
    /**
     * Aqui creamos los metodos para poder recibir parametros
     * @return fecha, usuario y libro
     */
    public LocalDate getFecha()
    {
        return fecha;
    }
    
    public Usuario getUsuario()
    {
        return usuario;
    }
    
    public Libro getLibro()
    {
        return libro;
    }
    
}
