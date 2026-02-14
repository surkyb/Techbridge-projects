/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sistema_de_biblioteca;

import java.util.Scanner;

/**
 *
 * @author Gilber Vido
 */
public class Main {

    /**
     * Esta clase es para hacer la prueba de que todo esta correcto.
     */
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int decision;
        
        /**
         * Primero creamos los libros.
         */
        
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupery", "67890");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "97815");
        
        /**
         * Creamos usuario
         */
        
        Usuario usuario1 = new Usuario("Gilber", "G001");
        
        /**
         * Aqui prestamos el libro
         */
        
        System.out.println("Desea Prestar un libro?");
        System.out.println("\n1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        if (decision == 1)
        {
            if (usuario1.prestarLibro(libro1))
            {
                Prestamo prestamo1 = new Prestamo(usuario1, libro1);
                System.out.println("Prestamo realizado el: " + prestamo1.getFecha());
            }
        }
        /**
         * Aqui intentamos de prestar el mismo libro para ver que sucede
         */
        
        usuario1.prestarLibro(libro1);
        
        /**
         * Aqui devolvemos libro
         */
        System.out.println("\nQuieres devolver el libro? ");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        
        if( decision == 1)
        {
            usuario1.devolverLibro(libro1);
        }
        
        
        /**
         * Verificamos si vuelve a estar disponible 
         */
        System.out.println("\nQuieres ver si el libro se encuentra disponible?");
        System.out.println("1. Si");
        System.out.println("2. No");
        decision = tc.nextInt();
        if (decision == 1)
        {
         System.out.println("\nDisponible? " + libro1.disponibilidadLibro());
        }
    }
    
}
