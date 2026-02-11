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
public class ejercicio7 {

    /**
     * @param args Este es el ejercicio #7 de la tarea
     */
    public static void main(String[] args) {
        
        int numero1, numero2;
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("---- VERIFICADOR DE MENOR-MAYOR ----");
        System.out.println("\nAgrega el primero numero:");
        numero1 = tc.nextInt();
        
        System.out.println("Agrega el segundo numero: ");
        numero2 = tc.nextInt();
        
        if (numero1 > numero2)
        {
            System.out.println("\nEl numero mayor es: "+ numero1);
            System.out.println("Y el menor es: " + numero2);
        }
        else
        {
            System.out.println("\nEl numero mayor es: " + numero2);
            System.out.println("Y el menor es: " + numero1);
        }
    }
    
}
