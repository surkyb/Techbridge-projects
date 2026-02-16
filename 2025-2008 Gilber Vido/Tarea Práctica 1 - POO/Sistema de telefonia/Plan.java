/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_de_telefonia;

/**
 *
 * @author Gilber Vido Matricula 2025-2008
 */
public class Plan {
    
    /**
     * Aqui declaramos nuestros atributos
     */
    private int minutosIncluidos;
    private double datosIncluidos;
    private double precioMensual;
    
    /**
     * Aqui creamos el constructor para poder agregarle datos
     * a nuestros atributos
     * @param minutosIncluidos
     * @param datosIncluidos
     * @param precioMensual 
     */
    public Plan(int minutosIncluidos, double datosIncluidos, double precioMensual)
    {
        this.minutosIncluidos = minutosIncluidos;
        this.datosIncluidos = datosIncluidos;
        this.precioMensual = precioMensual;
    }
    
    /**
     * Este es un meotodo sencillo que retorna los minutos incluidos
     * @return minutosIncluidos
     */
    public int getMinutosIncluidos()
    {
        return minutosIncluidos;
    }
    
    /**
     * Este es otro metodo sencillo que retorna los datos incluidos
     * @return datosIncluidos
     */
    public double getDatosIncluidos()
    {
        return datosIncluidos;
    }
    
    /**
     * Este es otro metodo sencillo que retorna el precio mensual
     * @return precioMensual
     */
    public double getPrecioMensual()
    {
        return precioMensual;
    }
    
    /**
     * Aqui creo un meotodo con toString para poder plasmar todos
     * los datos de manera textual
     * @return Representacion textual del objeto
     */
    @Override
    public String toString()
    {
        return "Minutos incluidos: " + minutosIncluidos +
               "\nDatos incluidos: " + datosIncluidos + " GB" +
               "\nPrecio mensual: RD$ " + precioMensual;
    }
}
