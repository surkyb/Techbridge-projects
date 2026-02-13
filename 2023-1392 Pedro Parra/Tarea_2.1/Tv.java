/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author Pedro
 */
public class Tv {

    // Atributos
    String marca;
    int pulgadas;
    boolean encendido;
    int volumen;

    
    public void encender() {
        encendido = true;
        System.out.println("La TV se esta encendiendo...");
    }

    public void apagar() {
        encendido = false;
        System.out.println("La TV se esta apagando...");
    }

    public void subirVolumen() {
        volumen++;
        System.out.println("Subiendo el volumen...");
    }

    public void bajarVolumen() {
        volumen--;
        System.out.println("Bajando el volumen...");
    }
}
