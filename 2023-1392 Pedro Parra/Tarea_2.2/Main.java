/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class Main {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("Suma (2): " + calc.sumar(5, 3));
        System.out.println("Resta (2): " + calc.restar(10, 4));
        System.out.println("Multiplicación (2): " + calc.multiplicar(2, 6));
        System.out.println("División (2): " + calc.dividir(20, 5));

        System.out.println("----------------------");

        // 3 parámetros
        System.out.println("Suma (3): " + calc.sumar(1, 2, 3));
        System.out.println("Resta (3): " + calc.restar(10, 2, 3));
        System.out.println("Multiplicación (3): " + calc.multiplicar(2, 3, 4));

        System.out.println("----------------------");

    
        System.out.println("Suma (4): " + calc.sumar(1, 2, 3, 4));
        System.out.println("Resta (4): " + calc.restar(20, 3, 2, 1));
        System.out.println("Multiplicación (4): " + calc.multiplicar(2, 2, 2, 2));
    }
}