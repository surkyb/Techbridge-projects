/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadevehiculos;

/**
 *
 * @author Gilber Vido Matricula 2025-2008 
 */
public class Vehiculo {
    
    /**
     * Aqui declaramos nuestros atributos
     */
    private int placa;
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo() 
    {

    }

    /**
     * Este es un costructor el cual recibe los atributos
     * @param marca marca del vehículo
     * @param modelo modelo del vehículo
     */
    public Vehiculo(String marca, String modelo) 
    {
        this.marca = marca;
        this.modelo = modelo;
    }

    /*
    * constructor completo
     */
    public Vehiculo(int placa, String marca, String modelo) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
    
    /**
     * Este es un metodo sencillo el cual retornara la marca
     * @return marca
     */
    public String getMarca() 
    {
        return marca;
    }

    /**
     * Este es otro metodo sencillo el cual retorna el modelo
     * @return modelo
     */
    public String getModelo() 
    {
        return modelo;
    }

    /**
     * Este es otro metodo que retorna la placa
     * @return placa
     */
    public int getPlaca() 
    {
        return placa;
    }

    /**
     * Este metodo calcula el estimado del mantenimiento dependiendo 
     * cuantos kilometros se ha recorrido
     * @return costo de mantenimiento 
     */
    public float calcularMantenimiento(float totalKm) 
    {
        if (totalKm > 15000) {
            return 750;
        }

        
        return 300;
    }

    /**
     * Este metodo calcula el costo estimado de mantenimiento dependiendo
     * los kilómetros recorridos y tipo de servicio.
     */
    public float calcularMantenimiento(float totalKm, String tipoDeServicio) 
    {
        if (tipoDeServicio.equalsIgnoreCase("Basico")) 
        {
            return totalKm > 15000 ? 750 : 500;
        }
        else if (tipoDeServicio.equalsIgnoreCase("Estandar")) 
        {
            return totalKm > 15000 ? 1000 : 700;
        }
        else if (tipoDeServicio.equalsIgnoreCase("premium")) 
        {
            return totalKm > 15000 ? 1500 : 1000;
        }
        return 300; // 
    }
}
