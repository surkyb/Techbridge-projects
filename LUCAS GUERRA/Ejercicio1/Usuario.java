import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario de la biblioteca.
 */
public class Usuario {
    private String nombre;
    private String idUnico;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, String idUnico) {
        this.nombre = nombre;
        this.idUnico = idUnico;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    /**
     * Añade un libro a la lista de prestados.
     */
    public void agregarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    /**
     * Elimina un libro de la lista de prestados.
     */
    public void removerLibro(Libro libro) {
        librosPrestados.remove(libro);
    }
}