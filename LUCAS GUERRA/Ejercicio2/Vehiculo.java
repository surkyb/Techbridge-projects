/**
 * Representa un vehículo y calcula sus costos de mantenimiento.
 * Aplica sobrecarga de constructores y métodos.
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;

    // --- 1. Constructores Sobrecargados ---

    /** Constructor Completo */
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    /** Constructor Básico (Solo placa) */
    public Vehiculo(String placa) {
        this(placa, "Desconocida", "Desconocido");
    }

    /** Constructor por Defecto */
    public Vehiculo() {
        this("Sin Placa", "Genérica", "Genérico");
    }

    // --- 2. Métodos Sobrecargados ---

    /**
     * Calcula mantenimiento basado solo en Kilometraje.
     * Costo base: $5 por Km.
     */
    public double calcularMantenimiento(int km) {
        return km * 5.0;
    }

    /**
     * Calcula mantenimiento basado en Km y tipo de servicio.
     * Tipos: "aceite" (+$500), "frenos" (+$1500).
     */
    public double calcularMantenimiento(int km, String tipoServicio) {
        double costoBase = calcularMantenimiento(km); // Reutilizamos lógica
        double costoExtra = 0;

        if (tipoServicio.equalsIgnoreCase("aceite")) {
            costoExtra = 500;
        } else if (tipoServicio.equalsIgnoreCase("frenos")) {
            costoExtra = 1500;
        }
        
        return costoBase + costoExtra;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " [" + placa + "]";
    }
}