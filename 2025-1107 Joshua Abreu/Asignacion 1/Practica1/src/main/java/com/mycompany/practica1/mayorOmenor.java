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
public class mayorOmenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mayor,menor;
        //aqui el usuario ingresa valores a las variables mediante scanner
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        
        // si el primer numero es mayor mostrara ese como el mayor, sino el segundo
        if(num1 > num2){
            System.out.println("El mayor es el primer numero: " + num1);
        }else{
            System.out.println("El mayor es el segundo numero " + num2);
        }
        
    }
    
}
