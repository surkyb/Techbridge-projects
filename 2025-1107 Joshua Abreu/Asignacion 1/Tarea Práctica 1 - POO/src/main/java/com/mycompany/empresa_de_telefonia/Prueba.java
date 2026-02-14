/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_de_telefonia;

/**
 *
 * @author Joshua Abreu
 */
public class Prueba {
    public static void main(String[] args) {
        
        // Ejemplo 1: Se pasa del plan y tiene cargos extra
        Plan planBasico = new Plan(50, 4, 1000);       
        Clientes cliente1 = new Clientes("Joshua", "8491230102", planBasico);
        Factura factura1 = new Factura(cliente1, 100, 6);      
        factura1.generarFactura();
        
        System.out.println();
        // Ejemplo 2: No se pasa del plan asi no genera cargos extra)
        Clientes cliente2 = new Clientes("Jaimee", "8295553344", planBasico);
        Factura factura2 = new Factura(cliente2, 40, 3);
        factura2.generarFactura();
    }
}
