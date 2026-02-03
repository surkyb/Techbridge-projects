/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.TechBrigde;

import java.util.Scanner;

/**
 *
 * @author Surky Báez
 */
public class Ejercicio02_Operaciones {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int menu = 0;
        var num1 = 0;
        var num2 = 0;
        
        while(menu != 6){
            System.out.println("--- MENÚ ---");
            System.out.println("1. Insertar dos numeros (a) y (b)");
            System.out.println("2. Suma");
            System.out.println("3. Resta");
            System.out.println("4. Multiplicacion");
            System.out.println("5. Division");
            System.out.println("6. Salir");
            menu = sc.nextInt();
            
            switch(menu){
                case 1: 
                    System.out.println("INGRESA TU PRIMER NÚMERO");
                     num1 = sc.nextInt();
                    System.out.println("INGRESA TU SEGUNDO NÚMERO");
                     num2 = sc.nextInt();
                break;
                case 2: 
                     System.out.println("suma = " + Suma(num1, num2));
                break;
                case 3: 
                    System.out.println("Resta = " + Resta(num1, num2));
                    break;
                case 4:
                    System.out.println("Multiplicacion = " + Multiplicacion(num1, num2));
                    break;
                case 5:
                    System.out.println("Division = " + Division(num1, num2));
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" Ingrese un valor valido ");
                    break;        
                   
            }
        }
   
    }
    
    public static double Suma(int num1, int num2){
        return num1 + num2;
    }
    public static double Resta(int num1, int num2){
        return num1 - num2;
    }
    public static double Multiplicacion(int num1, int num2){
        return num1 * num2;
    }
    public static double Division(int num1, int num2){
        
        if (num2 != 0) {
        return (double) num1 / num2;    
        }else{
            return 0.0;
        }
        
    }
}

