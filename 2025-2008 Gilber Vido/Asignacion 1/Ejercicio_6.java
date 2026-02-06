/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.teachbridge;

import java.util.Scanner;

/**
 *
 * @author gilber
 */
public class ejercicio6 {

    /**
     * @param args Este es el ejercicio #6 de esta tarea
     */
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int numero = 0;
        int resultado = 0;
        
        System.out.println(" ---- TABLA DE MULTIPLICAR ---");
        System.out.println("\nIngresa el numero que quieres la tabla:");
        
        numero = tc.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " +resultado);
        }
    }
    
}
