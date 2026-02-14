/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeBiblioteca;

import java.util.ArrayList;

/**
 * Representa un usuario de la biblioteca, con nombre, ID único y colección de
 * libros prestados.
 */
public class Usuario {

    private String nombre;
    private String idUnico;
    private ArrayList<Libro> librosPrestados = new ArrayList<>();

    /**
     * Constructor que inicializa un usuario con su nombre y ID único.
     * @param nombre nombre del usuario
     * @param idUnico identificador único del usuario
     */
    public Usuario(String nombre, String idUnico) {
        this.nombre = nombre;
        this.idUnico = idUnico;
    }

    /**
     * @return nombre del usuario como String
     */
    public String getNombreUsuario() {
        return nombre;
    }
    
    
    /**
     * Devuelve un libro previamente prestado por el usuario. Actualiza la
     * disponibilidad del libro.
     * @param libroARemover libro que será devuelto
     */
    public void devolverLibro(Libro libroARemover) {
        // se le resta del array y vuelve a estar disponible 

        librosPrestados.remove(libroARemover);
        libroARemover.setEstadoLibro(true);
        System.out.println("Tu libro ha sido devuelto");

    }
    
    /**
     * Agrega un libro a la lista de libros prestados por el usuario.
     * @param libroAAgg libro que será agregado
     */
    public void agregarLibroPrestado(Libro libroAAgg) {
        librosPrestados.add(libroAAgg);
    }
    
}

