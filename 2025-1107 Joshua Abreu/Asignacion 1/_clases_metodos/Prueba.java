/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asignacion2._clases_metodos;

/**
 *
 * @author Joshua Abreu
 */
public class Prueba {
    public static void main(String[] args) {
        //Inicializacion de los objetos tv
        TV tv1 = new TV();
        TV tv2 = new TV();
        TV tv3 = new TV();
        
        //Television 1
        
        tv1.marca = "Samsung";
        tv1.pulgadas = 43;
        tv1.volumen = 75;
        tv1.encendido = true;
        System.out.println("\n---TV 1---");
        //Llamada de los metodos
        tv1.encender();
        tv1.apagar();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        
        //Television 2
        tv2.marca = "LG";
        tv2.pulgadas = 50;
        tv2.volumen = 25;
        tv2.encendido = false;
        System.out.println("\n---TV 2---");
        //Llamada de los metodos
        tv2.encender();
        tv2.apagar();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        
        //Television 3
        tv3.marca = "Sony";
        tv3.pulgadas = 65;
        tv3.volumen = 55;
        tv3.encendido = true;
        System.out.println("\n---TV 3---");
        //Llamada de los metodos
        tv3.encender();
        tv3.apagar();
        tv3.subirVolumen();
        tv3.bajarVolumen();
    }
}
