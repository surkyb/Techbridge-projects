/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author Julio
 */
public class NumParesWHILE {
    public static void main(String[] args) {
        int num = 2;
        System.out.println("Numeros pares de 2 en 2");
        
        //mientras se cumpla la condicion se repite el ciclo y suma 2 a l variable asi seran pares
        while(num <= 100){
            System.out.println(num);
            num +=2;
        }
    }
    
}
