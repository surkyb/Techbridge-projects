/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2_2;

/**
 *
 * @author Surky
 */
public class Prueba {
    public static void main(String[] args) {
       
        Calculadora calculadora = new Calculadora();

        // Pruebas con 2 parametros
        System.out.println("Suma con dos parametros " + calculadora.sumar(9, 8));
        System.out.println("Resta con dos parametros : " + calculadora.restar(7, 4));
        System.out.println("Multiplicación con dos parametros : " + calculadora.multiplicar(8, 9));
        System.out.println("División con dos parametros : " + calculadora.dividir(30, 5));

        // Pruebas con 3 parametros
        System.out.println("Suma con tres parametros: " + calculadora.sumar(20, 30, 50));
        System.out.println("Resta con tres parametros: " + calculadora.restar(69, 8, 10));
        System.out.println("Multiplicación con tres parametros: " + calculadora.multiplicar(8, 3, 4));

        // Pruebas con 4 parametros
        System.out.println("Suma con cuatro parametros: " + calculadora.sumar(3, 10, 3, 4));
        System.out.println("Resta con cuatro parametros: " + calculadora.restar(20, 30, 3, 5));
        System.out.println("Multiplicación con cuatro parametros: " + calculadora.multiplicar(4, 1, 9, 8));

    }
    
}
