/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tv;

import java.util.Scanner;

/**
 *
 * @author Gilber Vido
 * Matricula: 2025-2008
 */
public class Prueba {

    /**
     * 
     */
    public static void main(String[] args) {
        
        /**
         * He creado este scanner para que el usuario pueda
         * escribir su eleccion (Esto no era necesario en la tarea 
         * pero quise implementarlo para mas dinamismo).
         */
        Scanner tc = new Scanner(System.in);
        /**
         * Aqui creamos las instancias de la clase
         * para asi poder agregarle los valores 
         * correspondientes.
         */
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();
        
        // Tv #1 //
        tv1.marca = "LG";
        tv1.pulgadas = 25;
        tv1.volumen = 60;
        tv1.precio = 16000;
        
        // Tv #2 //
        tv2.marca = "Samsung";
        tv2.pulgadas = 45;
        tv2.volumen = 85;
        tv2.precio = 12000;
        
        // Tv #3 // 
        tv3.marca = "Tecnomaster";
        tv3.pulgadas = 32;
        tv3.volumen = 70;
        tv3.precio = 10000;
        
        System.out.println("===== TV =====");
        System.out.println("Marca : " + tv1.marca);
        System.out.println("Pulgadas: " + tv1.pulgadas);
        System.out.println("Volumen: " + tv1.volumen);
        System.out.println("Precio: " + tv1.precio);
        int decision ;
        
        
        // Esta parte la agregue por dinamismo, no estaba en la tarea//
        System.out.println("\nDesea encender?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv1.encender();
        }
        
        System.out.println("\nDeseas Apagar?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv1.apagar();
        }
        
        System.out.println("\nDeseas subir volumen?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv1.subirVolumen();
        }
        
        System.out.println("\nDeseas bajar volumen?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv1.bajarVolumen();
        }
        
        System.out.println("\n===== TV =====");
        System.out.println("Marca : " + tv2.marca);
        System.out.println("Pulgadas: " + tv2.pulgadas);
        System.out.println("Volumen: " + tv2.volumen);
        System.out.println("Precio: " + tv2.precio);
        
         // Esta parte la agregue por dinamismo, no estaba en la tarea//
        System.out.println("\nDesea encender?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv2.encender();
        }
        
        System.out.println("\nDeseas Apagar?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv2.apagar();
        }
        
        System.out.println("\nDeseas subir volumen?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv2.subirVolumen();
        }
        
        System.out.println("\nDeseas bajar volumen?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv2.bajarVolumen();
        }
        
        System.out.println("\n===== TV =====");
        System.out.println("Marca : " + tv3.marca);
        System.out.println("Pulgadas: " + tv3.pulgadas);
        System.out.println("Volumen: " + tv3.volumen);
        System.out.println("Precio: " + tv3.precio);
        
        // Esta parte la agregue por dinamismo, no estaba en la tarea//
        System.out.println("\nDesea encender?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv3.encender();
        }
        
        System.out.println("\nDeseas Apagar?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv3.apagar();
        }
        
        System.out.println("\nDeseas subir volumen?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv3.subirVolumen();
        }
        
        System.out.println("\nDeseas bajar volumen?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        //Aqui verificamos si el usuario quiere ejecutar la accion o no//
        if(decision == 1)
        {
            tv3.bajarVolumen();
        }
        
    }
    
}
