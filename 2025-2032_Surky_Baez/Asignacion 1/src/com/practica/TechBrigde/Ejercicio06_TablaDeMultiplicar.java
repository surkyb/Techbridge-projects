/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.TechBrigde;

/**
 *
 * @author Surky Báez
 */

import java.util.Scanner;

public class Ejercicio06_TablaDeMultiplicar {
    public static void main(String[] args) {
        //Realizar un programa que mediante la utilización de bucles, debe permitir imprimir cualquier tabla de multiplicar.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero para crear su tabla de multiplicar: ");
        int numIngresado = scanner.nextInt();
       
        for (int i = 1; i <= 10; i++) {
            System.out.println(numIngresado + "X" + i + "= " + numIngresado * i );
        }
        
        scanner.close();
        
        
    }
    
}
