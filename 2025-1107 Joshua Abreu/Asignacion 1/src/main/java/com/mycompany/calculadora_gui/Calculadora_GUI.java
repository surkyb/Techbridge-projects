/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_gui;

/**
 *
 * @author Joshua Abreu
 */
public class Calculadora_GUI {
    /**
     * Realiza la suma de dos valores.
     * 
     * @param valor1 Primer número
     * @param valor2 Segundo número
     * @return Resultado de la suma
     */
    public double sumar(double valor1, double valor2){
       return valor1 + valor2; 
    }
    /**
     * Realiza la resta de dos valores.
     * 
     * @param valor1 Primer número
     * @param valor2 Segundo número
     * @return Resultado de la resta
     */
    public double restar(double valor1, double valor2){
        return valor1 - valor2;
    }
    /**
     * Realiza la multiplicación de dos valores.
     * 
     * @param valor1 Primer número
     * @param valor2 Segundo número
     * @return Resultado de la multiplicación
     */
    public double multiplicar(double valor1, double valor2){
        return valor1 * valor2;
    }
    /**
     * Realiza la división de dos valores.
     * Si el divisor es 0, retorna 0 como medida de seguridad.
     * 
     * @param valor1 Dividendo
     * @param valor2 Divisor
     * @return Resultado de la división o 0 si el divisor es 0
     */
    public double dividir(double valor1, double valor2){
        if(valor2 == 0){
            return 0;
        }
        return valor1 / valor2;
    }  
}
