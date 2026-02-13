/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprimerparcial;

/**
 * Clase CalculadoraMatematica
 *
 * Representa una calculadora básica que utilizando dos números de tipo double
 * permite realizar operaciones matemáticas simples (suma, resta, multiplicación
 * y división).
 *
 * @author SurkyBaez 2025-2032
 */

public class CalculadoraMatematica {

    //atributos
    private double numero1;
    private double numero2;

    //constructor vacio (se que java lo hace automn pero lo hice para ejemplificar)
    public CalculadoraMatematica() {
    }

    /**
     * Se determinan los valores a utilizar en las operaciones
     *
     * @param numero1 Primer número ingresado por el usuario
     * @param numero2 Segundo número ingresado por el usuario
     */
    //setter
    public void setNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //metodos de operaciones
    
    /**
     * Calcula la suma de los dos números.
     * @return Resultado de la suma
     */
    public double calcularSuma() {
        return numero1 + numero2;
    }

    /**
     * Calcula la resta de los dos números.
     * @return Resultado de la resta
     */
    public double calcularResta() {
        return numero1 - numero2;
    }

    /**
     * Calcula la multiplicación de los dos números.
     * @return Resultado de la multiplicación
     */
    public double calcularMultiplicacion() {
        return numero1 * numero2;
    }

    /**
     * Calcula la división entre los dos números. Valida que el divisor no sea
     * cero antes de dividir.
     * @return Resultado de la división o 0 si se intenta dividir por cero
     */
    public double calcularDivision() {

        if (numero2 == 0) {
            System.out.println("No se puede dividir entre cero.");
            return 0.0;
        }
        return numero1 / numero2;

    }

}
