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
public class ejercicio8 {

    /**
     * @param args Este es el ejercicio #8 de la tarea
     */
    public static void main(String[] args) {
        int numero;
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("----- PAR O IMPAR -----");
        System.out.println("\nIngresa un numero: ");
        numero = tc.nextInt();
        
        if (numero % 2 == 0)
        {
            System.out.println("El numero " + numero + " es par");
            
        }
        else
        {
            System.out.println("El numero " + numero + " es impar");
        }
    }
    
}
