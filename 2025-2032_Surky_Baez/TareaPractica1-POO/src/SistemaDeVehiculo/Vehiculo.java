/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeVehiculo;

/**
 * Representa un vehículo con atributos básicos como placa, marca y modelo.
 * Permite calcular el costo estimado de mantenimiento según kilómetros
 * recorridos y tipo de servicio.
 */
public class Vehiculo {

    private int placa;
    private String marca;
    private String modelo;
    private double precio;

    /**
     * Constructor por defecto que inicializa un vehículo con valores vacíos.
     */
    public Vehiculo() {

    }

    /**
     * Constructor básico
     *
     * @param marca marca del vehículo
     * @param modelo modelo del vehículo
     */
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /*
    * constructor completo
    *@param placa número de placa del vehículo
     * @param marca marca del vehículo
     * @param modelo modelo del vehículo
     */
    public Vehiculo(int placa, String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
    
    /* @return marca*/
    public String getMarca() {
        return marca;
    }

    /* @return modelo*/
    public String getModelo() {
        return modelo;
    }

    /* @return placa*/
    public int getPlaca() {
        return placa;
    }

    /**
     * Calcula el costo estimado de mantenimiento según kilómetros recorridos.
     *
     * @param kmTotales kilómetros recorridos
     * @return costo de mantenimiento como float
     */
    public float calcularMantenimiento(float kmTotales) {
        if (kmTotales > 10000) {
            return 900;
        }

        
        return 500;
        //+400 por km + 1000
    }

    /**
     * Calcula el costo estimado de mantenimiento según kilómetros recorridos y
     * tipo de servicio.
     *
     * @param kmTotales kilómetros recorridos
     * @param tipoDeServicio "simple", "elaborado" o "completo"
     * @return costo estimado de mantenimiento como float
     */
    public float calcularMantenimiento(float kmTotales, String tipoDeServicio) {
        if (tipoDeServicio.equalsIgnoreCase("simple")) {
            return kmTotales > 10000 ? 900 : 500;
        } else if (tipoDeServicio.equalsIgnoreCase("elaborado")) {
            return kmTotales > 10000 ? 1500 : 700;
        } else if (tipoDeServicio.equalsIgnoreCase("completo")) {
            return kmTotales > 10000 ? 2000 : 1000;
        }
        return 500; // valor por defecto
    }

}
