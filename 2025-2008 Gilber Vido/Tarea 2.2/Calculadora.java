/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Gilber Vido Matricula 2025-2008
 */
public class Calculadora {
     /**
     * Aqui creamos los metodos de solo 2 parametros
     * @return El resultado de las operaciones
    */
    public int sumar(int a, int b)
    {
        return a + b;
    }
    
    public int restar(int a, int b)
    {
        return a - b;
    }
    
    public int multiplicar(int a, int b)
    {
        return a * b;
    }
    
    public int division(int a, int b)
    {
        return a / b;
    }
    
    /**
     * Aqui sobrecargamos los metodos con 3 parametros
     * @param a
     * @param b
     * @param c
     * @return Los resultados de las operaciones 
     */
    public int sumar(int a, int b, int c)
    {
        return a + b + c;
    }
    
    public int restar(int a, int b, int c)
    {
        return a - b - c;
    }
    
    public int multiplicar(int a, int b, int c)
    {
        return a * b * c;
    }
    
    /**
     * Aqui sobrecargamos los metodos con 4 parametros
     * @param a
     * @param b
     * @param c
     * @param d
     * @return Los resultados de las operaciones
     */
    public int sumar(int a, int b, int c, int d)
    {
        return a + b + c + d;
    }
    
    public int restar(int a, int b, int c, int d)
    {
        return a - b - c - d;
    }
    
    public  int multiplicar(int a, int b, int c, int d)
    {
        return a * b * c * d;
    }
}
