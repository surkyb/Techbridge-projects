/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Gilber Vido Matricula 2025-2008
 */
public class Main {

    /**
     * Esta clase es para demostrar el funcionamiento de 
     * todos los metodos 
     */
    public static void main(String[] args) {
        Calculadora calcu = new Calculadora();
        
        // Esta es la prueba con 2 parametros // 
        System.out.println("Suma de 2 parametros: " + calcu.sumar(15, 5));
        
        System.out.println("Resta de 2 parametros: " + calcu.restar(20,7));
        
        System.out.println("Multiplicacion de 2 parametros: " + calcu.multiplicar(5, 9));
        
        System.out.println("Division de 2 parametros" + calcu.division(14, 2));
        
        //Esta es la prueba con 3 parametros// 
        System.out.println("\nSuma de 3 parametros: " + calcu.sumar(15, 5, 9));
        
        System.out.println("Resta de 3 parametros: " + calcu.restar(20,7, 2));
        
        System.out.println("Multiplicacion de 3 parametros: " + calcu.multiplicar(5, 9, 2));
        
        //Esta es la prueba con 4 parametros //
        System.out.println("\nSuma de 4 parametros: " + calcu.sumar(15, 5, 9, 2));
        
        System.out.println("Resta de 4 parametros: " + calcu.restar(20,7, 2, 1));
        
        System.out.println("Multiplicacion de 4 parametros: " + calcu.multiplicar(5, 9, 2, 3));
        
        
    }
    
}
