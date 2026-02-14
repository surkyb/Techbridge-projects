/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_de_vehiculos;

/**
 *
 * @author Joshua Abreu
 */
public class Vehiculo {
    //atributos de la clase vehiculo
    private String placa;
    private String marca;
    private String modelo;
    
    
     /**
     * Constructor básico que inicializa el vehículo solo con la placa.
     * La marca y el modelo se asignan con valores por defecto.
     * 
     * @param placa placa del vehículo
     */   
    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "Desconocido";
        this.modelo = "Desconocido";
    }
    
     /**
     * Constructor completo que inicializa el vehículo con placa, marca y modelo.
     * 
     * @param placa placa del vehículo
     * @param marca marca del vehículo
     * @param modelo modelo del vehículo
     */
    public Vehiculo(String placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Constructor sin parámetros, asigna valores totalmente por defecto
    public Vehiculo(){
        this.placa = "Sin placa";
        this.marca = "Antigua";
        this.modelo = "Normal";     
    }
    
      /**
     * Calcula el costo de mantenimiento del vehículo
     * únicamente en función de los kilómetros recorridos.
     * 
     * @param km kilómetros recorridos por el vehículo
     * @return costo del mantenimiento
     */
    public double calcularMantenimiento(int km){
        return km * 0.25;      
    } 
    
    /**
     * Calcula el costo de mantenimiento del vehículo según
     * los kilómetros recorridos y el tipo de servicio.
     * 
     * @param km kilómetros recorridos por el vehículo
     * @param tipoServicio tipo de servicio (básico o completo)
     * @return costo total del mantenimiento
     */
    public double calcularMantenimiento(int km, String tipoServicio){
        double costo = km * 0.25;
        
        // Aumenta el costo según el tipo de servicio
        if(tipoServicio.equalsIgnoreCase("basico")){
            costo += 200;
        }else if(tipoServicio.equalsIgnoreCase("completo")){
            costo += 400;
        }         
        return costo;
    }
    
    /**
     * Calcula el costo de mantenimiento del vehículo según
     * los kilómetros recorridos, el tipo de servicio
     * y el nivel de suciedad.
     * 
     * @param km kilómetros recorridos por el vehículo
     * @param tipoServicio tipo de servicio (básico o completo)
     * @param suciedad nivel de suciedad del vehículo
     * @return costo total del mantenimiento
     */
    public double calcularMantenimiento(int km, String tipoServicio, String suciedad){
         // Reutiliza el cálculo del método anterior
        double costo = calcularMantenimiento(km, tipoServicio);
         if(suciedad.equalsIgnoreCase("sucio")){
             costo += 200;
         }
         return costo;
    } 
}
