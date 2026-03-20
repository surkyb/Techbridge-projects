/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramultifuncion;

/**
 * Clase que contiene las operaciones matemáticas básicas
 * de la calculadora: suma, resta, multiplicación y división.
 * @author Surky
 */
public class Calculadora {     

    public double sumar(Double valor1, Double valor2) {
        return valor1 + valor2;
    }

    public double restar(Double valor1, Double valor2) {
        return valor1 - valor2;
    }

    public double multiplicar(Double valor1, Double valor2) {
        return valor1 * valor2;
    }
    
    /**
     * Realiza la división entre dos números. Lanza una excepción si se intenta
     * dividir entre cero.
     * @param valor1
     * @param valor2
     * @return 
     */
    public double dividir(Double valor1, Double valor2) {

        if (valor2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        return valor1 / valor2;

    }
}
