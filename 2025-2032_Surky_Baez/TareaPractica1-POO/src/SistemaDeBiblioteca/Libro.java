/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeBiblioteca;

/**
 * Representa un libro en la biblioteca, con título, autor, ISBN y estado de
 * disponibilidad.
 */
public class Libro {

    private String titulo;
    private String autor;
    private int ISBN;
    private boolean disponible;

    /**
     * Constructor que inicializa un libro como disponible por defecto.
     * @param ISBN número único del libro
     * @param titulo título del libro
     * @param autor autor del libro
     */
    public Libro(int ISBN, String titulo, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    /**
     * Constructor sobrecargado que permite establecer la disponibilidad
     * manualmente.
     *
     * @param titulo título del libro
     * @param autor autor del libro
     * @param ISBN número único del libro
     * @param disponible estado de disponibilidad inicial
     */
    public Libro(String titulo, String autor, int ISBN, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = disponible;
    }

    /**
     * @return título del libro como String
     */
    public String getNombreLibro() {
        return this.titulo;
    }

    /**
     * Cambia el estado de disponibilidad del libro.
     * @param disponible true si el libro está disponible, false si está
     * prestado
     */
    public void setEstadoLibro(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * @return true si el libro está disponible, false si no
     */
    public boolean getDisponibilidad() {
        return disponible;
    }

    /**
     * Muestra por consola la disponibilidad del libro.
     */
    public void consultarDisponibilidad() {
        if (disponible) {
            System.out.println("El libro " + titulo + " está disponible");
        } else {
            System.out.println("El libro requerido no está disponible");
        }
    }

}
