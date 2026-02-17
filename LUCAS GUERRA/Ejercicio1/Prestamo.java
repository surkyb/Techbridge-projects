import java.time.LocalDate;

/**
 * Gestiona la transacción de préstamo entre un Usuario y un Libro.
 */
public class Prestamo {
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }

    /**
     * Realiza el préstamo si el libro está disponible.
     */
    public boolean prestarLibro() {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            usuario.agregarLibro(libro);
            System.out.println("Préstamo exitoso: " + libro.getTitulo() + " a " + usuario.getNombre());
            return true;
        } else {
            System.out.println("Error: El libro " + libro.getTitulo() + " no está disponible.");
            return false;
        }
    }

    /**
     * Realiza la devolución del libro.
     */
    public void devolverLibro() {
        libro.setDisponible(true);
        usuario.removerLibro(libro);
        System.out.println("Devolución exitosa: " + libro.getTitulo());
    }
}