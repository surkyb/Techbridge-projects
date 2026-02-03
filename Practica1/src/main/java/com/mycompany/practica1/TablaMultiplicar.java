/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author Julio
 */
public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado;
        System.out.println("=== TABLA DE MULTIPLICAR ===");
        System.out.println("Ingrese el numero de la tabla que desea mostrar");
        
        int numUsuario = sc.nextInt();
        // for que llega a multiplicar hasta 10
        for (int i = 0; i <= 10; i++) {
            resultado = numUsuario * i; // multiplico el numero que ingreso el usuario * i que va hasta 10
            System.out.println(numUsuario + " * " + i + " = " + resultado);
        }
    }
    
}
