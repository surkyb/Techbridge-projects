/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa_de_telefonia;

/**
 *
 * @author Joshua Abreu
 */
public class Plan {
    private int minutosIncluidos;
    private int datosGB;
    private double precioMensual;
    
    /**
     * Constructor que crea un plan con minutos, datos y precio definidos.
     * 
     * @param minutosIncluidos cantidad de minutos incluidos en el plan
     * @param datosGB cantidad de datos incluidos en el plan (GB)
     * @param precioMensual costo mensual del plan
     */
    Plan(int minutosIncluidos, int datosGB, double precioMensual){
        this.minutosIncluidos = minutosIncluidos;
        this.datosGB = datosGB;
        this.precioMensual = precioMensual;
    }
    
    /**
     * Obtiene la cantidad de minutos incluidos en el plan.
     * 
     * @return minutos incluidos
     */
    public int getMinutosIncluidos(){
        return minutosIncluidos;
    }
    
    /**
     * Obtiene la cantidad de datos incluidos en el plan.
     * 
     * @return datos incluidos en GB
     */
    public int getDatosGB(){
        return datosGB;
    }
    
    /**
     * Obtiene el precio mensual del plan.
     * 
     * @return precio mensual del plan
     */
    public double getPrecioMensual(){
        return precioMensual;
    }     
}
