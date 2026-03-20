/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoramultifuncion;

/**
 * Clase que realiza operaciones especiales
 * como raíz cuadrada y cálculo de exponentes.
 * @author Surky
 */
public class RaizCuadrada_Exponente {

    /**
     * Calcula la raíz cuadrada de un número.
     * @param numero
     * @return 
     */
    public double calcularRaiz(double numero) {
        return Math.sqrt(numero);
    }

    /**
     * Calcula la potencia de un número.
     * @param base 
     * @param exponente 
     * @return 
     */
    public double calcularExponente(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}
