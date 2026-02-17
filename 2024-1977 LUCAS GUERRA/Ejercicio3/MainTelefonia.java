public class MainTelefonia {
    public static void main(String[] args) {
        // Plan: 100 min, 5GB, $1000 renta
        Plan planBasico = new Plan(100, 5, 1000.0);
        Cliente cliente = new Cliente("Carlos Pérez", "809-555-0101", planBasico);

        // Caso: Se pasó en minutos (120) y datos (7GB)
        Factura factura = new Factura(cliente, 120, 7);
        factura.generarFactura();
    }
}