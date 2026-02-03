/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author Julio
 */
public class SumaDOWHILE {
    
    public static void main(String[] args) {
        int suma = 0;
        int acumulador = 1;
        // do-while para que el codigo se imprima al menos una vez
        do{
            /* a la var suma se le asigna el valor de acumulador y se incrementa acumulador
            haciendo que cuando vuelva a iterar se le sume el valor  nuevo de suma al valor nuevo de acumulador*/
            suma += acumulador; 
            acumulador++;
        }while(acumulador <= 50);
        System.out.println("La suma total es: " + suma);
    }
}
