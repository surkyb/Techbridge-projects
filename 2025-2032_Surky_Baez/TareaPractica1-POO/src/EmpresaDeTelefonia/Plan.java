/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpresaDeTelefonia;

/**
 * Representa un plan de telefonía, que incluye minutos, datos y un precio
 * mensual. El precio se calcula automáticamente según los minutos y datos
 * incluidos.
 * @author UserGPC
 */
public class Plan {

    private int minutosIncluidos;
    private float datosIncluidos;
    private double precioMensual;

    /**
     * constructor de plan basico con 100 minutos y 50GB.
     */
    public Plan() {
        this.minutosIncluidos = 100;
        this.datosIncluidos = 50;
        this.precioMensual = devolverPrecioMensual();
    }

    /**
     * Constructor que permite especificar minutos y datos incluidos.
     *
     * @param minutosIncluidos cantidad de minutos incluidos en el plan
     * @param datosIncluidos cantidad de datos incluidos en GB
     */
    public Plan(int minutosIncluidos, float datosIncluidos) {
        this.minutosIncluidos = minutosIncluidos;
        this.datosIncluidos = datosIncluidos;
        this.precioMensual = devolverPrecioMensual();
    }

    /**
     * Calcula el precio mensual del plan Por cada minuto se cobran 5 y por cada
     * GB 10.
     * @return precio mensual calculado
     */
    private double devolverPrecioMensual() {
        return this.minutosIncluidos * 5 + this.datosIncluidos * 10;
    }

    /**
     * Devuelve los minutos incluidos en el plan
     * @return cantidad de minutos incluidos como int
     */
    public int getMinutosIncluidos() {
        return minutosIncluidos;
    }

    /**
     * Devuelve los datos incluidos en GB
     * @return cantidad de datos incluidos en GB como float
     */
    public float getDatosIncluidos() {
        return datosIncluidos;
    }

    /**
     * Devuelve el precio mensual del plan
     * @return precio mensual calculado como double
     */
    public double getPrecioMensual() {
        return precioMensual;
    }
}



