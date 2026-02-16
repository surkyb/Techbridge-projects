/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gilber Vido
 */
public class Usuario {
    
    /**
     * Aqui declaramos los atributos
     */
    private String nombre;
    private String ID;
    private List<Libro> librosPrestados;
    
    //Constructor
    public Usuario(String nombre, String ID)
    {
        this.nombre = nombre;
        this.ID = ID;
        this.librosPrestados = new ArrayList<>();
    }
    
    /**
     * En este metodo lo que hacemos es recibir el parametro libro
     * de la clase del mismo nombre y dentro verificanos si el libro
     * se encuentra en la lista, si es asi lo sacamos de la lista y lo 
     * marcamos como disponible. sino, imprimimos que no esta.
     * @param libro
     * @return un booleano
     */
    public boolean prestarLibro(Libro libro)
    {
      if(libro.disponibilidadLibro())
      {
          libro.marcarPrestado();
          librosPrestados.add(libro);
          return true;
      }
      else
      {
          System.out.println("El libro no esta disponible.");
          return false;
      }
    }
    
    public boolean devolverLibro(Libro libro)
    {
        if(librosPrestados.contains(libro)) 
      {
          librosPrestados.remove(libro);
          libro.marcarDisponible();
          return true;
      }
      else
      {
          System.out.println("Este usuario no tiene ese libro.");
          return false;
      }
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public List<Libro> getLibrosPrestados()
    {
        return librosPrestados;
    }
    
}
