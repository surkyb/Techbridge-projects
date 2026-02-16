/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.empresa_de_telefonia;

/**
 *
 * @author Gilber Vido 2025-2008
 */
public class Main {

    /**
     * Este Main es creado para poder agregar los datos correspondientes
     * y poder mostarar la factura 
     */
    public static void main(String[] args) {
        
        // Procedo a crear el plan
        Plan planBasico = new Plan(300, 15, 1200);
        
        // Proceso a crer un cliente con ese plan
        Cliente cliente1 = new Cliente("Gilber Vido", "809-930-3212", planBasico);
        
        // Registro el consumo y genero la factura
        Factura factura1 = new Factura(cliente1, 700, 15);
        
        // Llamo el metodo generarFactura
        factura1.generarFactura();
    }
    
}
