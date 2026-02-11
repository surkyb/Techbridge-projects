/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.teachbridge;

/**
 *
 * @author gilber
 */
public class ejercicio3 {

    /**
     * @param args Este es el ejercicio #3 de la tarea
     */
    public static void main(String[] args) {
        
        System.out.println("Numeros impares:");
        
        for(int i = 1; i < 100; i+=2)
        {
            if (i % 2 !=0)
            {
                System.out.println(i);
            }
            else
            {
                i++;
            }
        }
    }
    
}
