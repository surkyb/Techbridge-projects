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

public class Ejercicio08_ParOImpar {
    public static void main(String[] args) {
        //Realizar un programa que ingresado un numero, me indique si es par o impar.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numIngresado = scanner.nextInt();
        
        if (numIngresado % 2 == 0) {
            System.out.println(numIngresado + " es un número par");
        }else{
            System.out.println(numIngresado + " es un número impar");
        }
        
        scanner.close();
    }
    
}
