/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoramatematica;

import java.util.Scanner;

/**
 *
 * @author Joshua Abreu
 */
public class CalculadoraMatematica {

    // Atributos privados que almacenan los números
    private double numero1;
    private double numero2;

    // Constructor por defecto
    public CalculadoraMatematica() {
    }

    // Método único para asignar ambos números
    public void setNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método que realiza la suma
    public double sumar() {
        return numero1 + numero2;
    }

    // Método que realiza la resta
    public double restar() {
        return numero1 - numero2;
    }

    // Método que realiza la multiplicación
    public double multiplicar() {
        return numero1 * numero2;
    }

    // Método que realiza la división con validación
    public double division() {
        if (numero2 == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }

    // Método principal donde se ejecuta el programa
    public static void main(String[] args) {

        // Se crea el objeto calculadora
        CalculadoraMatematica calculadora = new CalculadoraMatematica();

        // Scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);
        int opcionUsuario;

        // Menú que se repite hasta que el usuario elija salir
        do {
            System.out.println("=== Calculadora Matematica ===");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");

            System.out.println("Seleccione una opcion");
            opcionUsuario = sc.nextInt();

            // Control de opciones del menú
            switch (opcionUsuario) {

                case 1:
                    // Ingreso de números por el usuario
                    System.out.println("Ingresar el primer numero");
                    double n1 = sc.nextDouble();

                    System.out.println("Ingresar el segundo numero");
                    double n2 = sc.nextDouble();

                    // Se asignan los números usando el método set
                    calculadora.setNumeros(n1, n2);
                    break;

                case 2:
                    // Llamada al método suma
                    System.out.println("El resultado de la suma es: " + calculadora.sumar());
                    break;

                case 3:
                    // Llamada al método resta
                    System.out.println("El resultado de la resta es: " + calculadora.restar());
                    break;

                case 4:
                    // Llamada al método multiplicación
                    System.out.println("El resultado de la multiplicacion es: " + calculadora.multiplicar());
                    break;

                case 5:
                    // Llamada al método división
                    System.out.println("El resultado de la division es: " + calculadora.division());
                    break;

                case 0:
                    // Salida del programa
                    System.out.println("Gracias por usar la calculadora");
                    break;

                default:
                    // Opción inválida
                    System.out.println("Opcion invalida. Intente nuevamente");
            }

        } while (opcionUsuario != 0);
    }
}
