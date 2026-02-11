/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Mayoramenor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
            System.out.println("El numero menor es: " + num2);
        } else if (num2 > num1) {
            System.out.println("El numero mayor es: " + num2);
            System.out.println("El numero menor es: " + num1);
        } else {
            System.out.println("Ambos numeros son iguales: " + num1);
        }

        sc.close();
    }
}

