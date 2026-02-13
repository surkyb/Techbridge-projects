/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea2_2;

/**
 *
 * @author Joshua Abreu
 */
public class Calculadora {
    //Metodos con 2 parametros
    public int sumar(int a, int b){
        return a + b;
    }
    public int restar(int a, int b){
        return a - b;
    }
    public int multiplicar(int a, int b){
        return a * b;
    }
    public int dividir(int a, int b){
        return a / b;
    }
    
    //Metodos con 3 parametros
    public int sumar(int a, int b, int c){
        return a + b + c;
    }
    public int restar(int a, int b, int c){
        return a - b - c;
    }
    public int multiplicar(int a, int b, int c){
        return a * b * c;
    }
    
    //Metodos con 4 parametros
    public int sumar(int a, int b, int c, int d){
        return a + b + c + d;
    }
    public int restar(int a, int b, int c, int d){
        return a - b - c - d;
    }
    public int multiplicar(int a, int b, int c, int d){
        return a * b * c * d;
    }   

    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        //Prueba con 2 parametros
        System.out.println("Prueba con 2 parametros");
        System.out.println("Suma(2 param): " + calcular.sumar(8, 5));
        System.out.println("Resta(2 param): " + calcular.restar(9, 3));
        System.out.println("Multiplicacion(2 param): " + calcular.multiplicar(5, 7));
        System.out.println("Division(2 param): " + calcular.dividir(12, 3));
        
        //Prueba con 3 parametros
        System.out.println("\nPrueba con 3 parametros");
        System.out.println("Suma(3 param): " + calcular.sumar(5, 9, 2));
        System.out.println("Resta(3 param): " + calcular.restar(20, 10, 1));
        System.out.println("Multiplicacion(3 param): " + calcular.multiplicar(3, 5, 2));
        
        //Prueba con 4 parametros
        System.out.println("\nPrueba con 4 parametros");
        System.out.println("Suma(4 param): " + calcular.sumar(5, 7, 9, 15));
        System.out.println("Resta(4 param): " + calcular.restar(40, 10, 9, 15));
        System.out.println("Multiplicacion(4 param): " + calcular.multiplicar(5, 7, 9, 15));
    }
}
