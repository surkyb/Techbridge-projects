/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeBiblioteca;

import java.time.LocalDate;

/**
 * Representa un préstamo de un libro realizado por un usuario en una fecha
 * específica.
 */
public class Prestamo {

    private LocalDate fecha;
    private Usuario usuario;
    private Libro libroAPrestar;

    /**
     * Constructor que inicializa un préstamo con usuario, libro y fecha.
     *
     * @param usuario usuario que recibe el préstamo
     * @param libro libro que será prestado
     * @param fecha fecha del préstamo
     */
    public Prestamo(Usuario usuario, Libro libro, LocalDate fecha) {

        this.usuario = usuario;
        this.libroAPrestar = libro;
        this.fecha = fecha;

    }

    /**
     * Presta el libro al usuario si está disponible. Cambia el estado del libro
     * y lo agrega a la lista de libros del usuario.
     */
    public void prestarLibro() {
        if (libroAPrestar.getDisponibilidad()) {
            usuario.agregarLibroPrestado(libroAPrestar);
            libroAPrestar.setEstadoLibro(false);
            System.out.println("El libro " + libroAPrestar.getNombreLibro() + " ha sido prestado a " + usuario.getNombreUsuario()+ " el dia " + fecha);
        } else {
            System.out.println("El libro solicitado no está disponible");
        }
    }
}