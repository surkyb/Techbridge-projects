public class MainBiblioteca {
    public static void main(String[] args) {
        Libro l1 = new Libro("Clean Code", "Robert C. Martin", "978-0132350884");
        Usuario u1 = new Usuario("Tu Nombre", "A001");

        Prestamo p1 = new Prestamo(u1, l1);
        
        // Intento 1: Debe funcionar
        p1.prestarLibro();
        
        // Intento 2: Debe fallar porque ya está prestado
        Prestamo p2 = new Prestamo(new Usuario("Otro", "A002"), l1);
        p2.prestarLibro();

        // Devolución
        p1.devolverLibro();
    }
}