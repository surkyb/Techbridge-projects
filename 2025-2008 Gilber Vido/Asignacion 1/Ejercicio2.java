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
public class ejercicio2 {

    /**
     * @param args Este es el ejercicio #2 de la tarea
     */
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int menu = 0;
        int operando1 = 0;
        int operando2 = 0;
        
        while(menu !=6)
        {
            System.out.println("------ MENU DE CALCU -----");
            System.out.println("1. Insertar valores ");
            System.out.println("2. Suma ");
            System.out.println("3. Resta ");
            System.out.println("4. Multiplicacion ");
            System.out.println("5. Division ");
            System.out.println("6. Salir ");
            
            menu = tc.nextInt();
            
            switch(menu)
            {
                case 1: 
                    System.out.println("Introduzca un valor {a}");
                    operando1 = tc.nextInt();
                    System.out.println("Introduzca un valor {b}");
                    operando2 = tc.nextInt();
                    break;
                case 2:
                    System.out.println("La suma es: "+ Suma(operando1,operando2));
                    break;
                case 3: 
                    System.out.println("La resta es: " + Resta(operando1,operando2));
                    break;
                case 4: 
                    System.out.println("La multiplicacion es: " + Multiplicacion(operando1, operando2));
                    break;
                case 5: 
                    System.out.println("La division es: " + Division(operando1, operando2));
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Selecciona un valor correcto");
            }
        }
    }
    
    public static float Suma(int operando1, int operando2)
    {
        return operando1 + operando2;
    }
    
    public static float Resta(int operando1, int operando2)
    {
        return operando1 - operando2;
    }
    
    public static float Multiplicacion(int operando1, int operando2)
    {
        return operando1 * operando2;
    }
    
    public static float Division(int operando1, int operando2)
    {
        if(operando1 != 0)
        {
            return operando1 / operando2;
        }
        else
        {
            return 0;
        }
    }
}
    
    

