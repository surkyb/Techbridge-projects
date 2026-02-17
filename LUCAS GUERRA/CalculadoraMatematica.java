package com.mycompany.calculadoramatematica;

import java.util.Scanner;


public class CalculadoraMatematica {

    // ---------------------------------------------------------
    // 1. ATRIBUTOS PRIVADOS (Encapsulamiento)
    // ---------------------------------------------------------
    /** Primer operando para los cálculos */
    private double numero1;
    
    /** Segundo operando para los cálculos */
    private double numero2;

    // ---------------------------------------------------------
    // 2. CONSTRUCTOR
    // ---------------------------------------------------------
    /**
     * Constructor por defecto.
     * Inicializa los atributos en 0.0 para evitar valores nulos.
     */
    public CalculadoraMatematica() {
        this.numero1 = 0.0;
        this.numero2 = 0.0;
    }

    // ---------------------------------------------------------
    // 3. MÉTODOS DE ENTRADA DE DATOS
    // ---------------------------------------------------------
    /**
     * Solicita al usuario los dos números necesarios para operar.
     * Utiliza el objeto Scanner pasado por parámetro para leer la entrada.
     * @param scanner Objeto para lectura de datos desde consola.
     */
    public void ingresarNumeros(Scanner scanner) {
        System.out.print("Ingrese el primer numero: ");
        this.numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo numero: ");
        this.numero2 = scanner.nextDouble();
        
        System.out.println(">>> Numeros ingresados correctamente.");
    }

 
    public double sumar() {
        return this.numero1 + this.numero2;
    }

    public double restar() {
        return this.numero1 - this.numero2;
    }

    public double multiplicar() {
        return this.numero1 * this.numero2;
    }

    
    public double dividir() {
   
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0.0;
        } else {
            return this.numero1 / this.numero2;
        }
    }

    public static void main(String[] args) {
 
        CalculadoraMatematica calculadora = new CalculadoraMatematica();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Bucle do-while para mantener el menú activo
        do {
            // Diseño visual exacto al "Ejemplo de Ejecución"
            System.out.println("\n===== CALCULADORA MATEMATICA =====");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opcion: ");

            // Validación basica para evitar crash si meten letras
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                scanner.next(); // Limpiar buffer
                opcion = -1;
            }

            // Estructura de control switch
            switch (opcion) {
                case 1:
                    calculadora.ingresarNumeros(scanner);
                    break;
                case 2:
                    System.out.println("Resultado de la suma: " + calculadora.sumar());
                    break;
                case 3:
                    System.out.println("Resultado de la resta: " + calculadora.restar());
                    break;
                case 4:
                    System.out.println("Resultado de la multiplicación: " + calculadora.multiplicar());
                    break;
                case 5:
                    // Guardamos el resultado para verificar si fue error
                    double res = calculadora.dividir();
                    if (res != 0.0 || calculadora.numero1 == 0) { 
                       System.out.println("Resultado de la division: " + res);
                    }
                    break;
                case 0:
                    System.out.println("¡Gracias por usar la calculadora!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);
        
        scanner.close();
    }
}