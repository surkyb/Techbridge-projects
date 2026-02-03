/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.TechBrigde;

/**
 *
 * @author Surky Báez
 */
import java.util.Scanner;

public class Ejercicio07_MayorYMenor {

    public static void main(String[] args) {
        //Realizar un programa que dado dos números, me indique cual es el mayor y cual es el menor de ambos.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu primer número: ");
        int primerNum = scanner.nextInt();

        System.out.print("Ingresa tu segundo número: ");
        int segundoNum = scanner.nextInt();

        if (primerNum == segundoNum) {
            System.out.println("Tus números son iguales");
        } else if (primerNum > segundoNum) {
            System.out.println(primerNum + " es mayor que " + segundoNum);
        } else {
            System.out.println(segundoNum + " es mayor que " + primerNum);
        }
        scanner.close();
    }
}
