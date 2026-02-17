/**
 * Define los detalles del plan de telefonía.
 */
public class Plan {
    private int minutosIncluidos;
    private int datosGB; // Datos en Gigabytes
    private double precioMensual;

    public Plan(int minutosIncluidos, int datosGB, double precioMensual) {
        this.minutosIncluidos = minutosIncluidos;
        this.datosGB = datosGB;
        this.precioMensual = precioMensual;
    }

    // Getters
    public int getMinutosIncluidos() { return minutosIncluidos; }
    public int getDatosGB() { return datosGB; }
    public double getPrecioMensual() { return precioMensual; }
}