/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author Julio
 */
public class MatematicaBasica {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var menu = 0;
        var a = 0;
        var b = 0;
        while(menu != 6){
        System.out.println("=== CALCULADORA EN JAVA ===");
        System.out.println("1. Ingrese los valores (a y b)");
        System.out.println("2. Sumar");
        System.out.println("3. Restar");
        System.out.println("4. Multiplicar");
        System.out.println("5. Dividir");
        System.out.println("6. Salir del programa");
        menu = sc.nextInt();
               //switch que llama a las funciones segun el numero seleccionado  
            switch (menu) {
                case 1:
                    System.out.println("Ingrese el valor [A]");
                    a = sc.nextInt();
                    System.out.println("Ingrese el valor [B]");
                    b = sc.nextInt();

                    break;                
                case 2:
                    System.out.println("La suma es = " + sumar(a, b));
                    break;
                case 3:
                    System.out.println("La resta es = " + restar(a, b));
                    break;
                case 4:
                    System.out.println("La multiplicacion es = " + multiplicacion(a, b));
                    break;
                case 5:
                    System.out.println("La division es = " + division(a, b));
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
                    break;
                    
            }
        }
        
        
    }
    //metodos suma,resta,multiplicacion,division
    public static int sumar(int a, int b){
        return a+b;
    }
    public static int restar(int a, int b){
        return a-b;
    }
    public static int multiplicacion(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        if(a != 0){
            return a/b;
        }else{
            return 0;
        }
        
    }
    
    
    
    
    
}
