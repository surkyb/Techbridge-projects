/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_de_telefonia;

/**
 *
 * @author Joshua Abreu
 */
public class Clientes {
    //Atributos de la clase Clientes
    private String nombre;
    private String numeroTelefonico;
    private Plan plan;
    
    /**
     * Constructor que crea un cliente con su nombre,
     * número telefónico y plan asignado.
     * 
     * @param nombre nombre del cliente
     * @param numeroTelefonico número telefónico del cliente
     * @param plan plan de telefonía asignado al cliente
     */
    Clientes(String nombre, String numeroTelefonico, Plan plan){
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.plan = plan;
    }
    
     /**
     * Obtiene el nombre del cliente.
     * 
     * @return nombre del cliente
     */
    public String getNombre(){
        return nombre;
    }
    
     /**
     * Obtiene el número telefónico del cliente.
     * 
     * @return número telefónico del cliente
     */
    public String getNumeroTelefonico(){
        return numeroTelefonico;
    }
    
    /**
     * Obtiene el plan asociado al cliente.
     * 
     * @return plan del cliente
     */
    public Plan getPlan(){
        return plan;
    }
}
