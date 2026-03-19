/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asignacion3_1;

/**
 *
 * @author Joshua Abreu
 */
public class AutoMovil {
    // Atributos de automóvil
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    
     // Constructor de la clase
    public AutoMovil(){
        // Mensaje que se muestra cuando se crea un objeto AutoMovil
        System.out.println("Esta es la clase AutoMovil");
    }

    // Método para obtener la marca
    public String getMarca() {
        return marca;
    }

    // Método para asignar la marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método para obtener el modelo
    public String getModelo() {
        return modelo;
    }

    // Método para asignar el modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método para obtener el año
    public int getAnio() {
        return anio;
    }

    // Método para asignar el año
    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método para obtener el color
    public String getColor() {
        return color;
    }

    // Método para asignar el color
    public void setColor(String color) {
        this.color = color;
    }
    
    // Método que simula encender el automóvil
    public void encender(){
        System.out.println("El Automovil se esta encendiendo...");
    }

    // Método que simula apagar el automóvil
    public void apagar(){
        System.out.println("El Automovil se esta apagando...");
    }

    // Método que simula acelerar el automóvil
    public void acelerar(){
        System.out.println("El Automovil esta acelerando...");
    }

    // Método que simula frenar el automóvil
    public void frenar(){
        System.out.println("El Automovil esta frenando...");
    }
}
