/**
 * Genera el cobro final calculando excesos de consumo.
 */
public class Factura {
    private Cliente cliente;
    private int minutosConsumidos;
    private int datosConsumidosGB;
    
    // Tarifas por exceso
    private static final double PRECIO_MINUTO_EXTRA = 5.0;
    private static final double PRECIO_GB_EXTRA = 200.0;

    public Factura(Cliente cliente, int minutosConsumidos, int datosConsumidosGB) {
        this.cliente = cliente;
        this.minutosConsumidos = minutosConsumidos;
        this.datosConsumidosGB = datosConsumidosGB;
    }

    /**
     * Calcula el total y genera el reporte detallado.
     */
    public void generarFactura() {
        Plan plan = cliente.getPlan();
        double total = plan.getPrecioMensual();
        
        System.out.println("--- FACTURA: " + cliente.getNombre() + " ---");
        System.out.println("Plan Base: $" + plan.getPrecioMensual());

        // Calcular exceso de minutos
        if (minutosConsumidos > plan.getMinutosIncluidos()) {
            int extra = minutosConsumidos - plan.getMinutosIncluidos();
            double costoExtra = extra * PRECIO_MINUTO_EXTRA;
            total += costoExtra;
            System.out.println("Exceso Minutos (" + extra + "): +$" + costoExtra);
        }

        // Calcular exceso de datos
        if (datosConsumidosGB > plan.getDatosGB()) {
            int extra = datosConsumidosGB - plan.getDatosGB();
            double costoExtra = extra * PRECIO_GB_EXTRA;
            total += costoExtra;
            System.out.println("Exceso Datos (" + extra + "GB): +$" + costoExtra);
        }

        System.out.println("---------------------------");
        System.out.println("TOTAL A PAGAR: $" + total);
    }
}