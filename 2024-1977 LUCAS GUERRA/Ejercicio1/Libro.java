/**
 * Representa un libro en el sistema de biblioteca.
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // Por defecto está disponible
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public boolean isDisponible() { return disponible; }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " (ISBN: " + isbn + ")";
    }
}