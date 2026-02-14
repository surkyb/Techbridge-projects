/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SistemaDeBiblioteca;

import java.time.LocalDate;

/**
 * Clase principal que ejecuta el sistema de biblioteca y prueba sus
 * funcionalidades. Crea libros, usuarios y registra préstamos mostrando
 * interacciones reales.
 * @author SurkyBaez
 */
public class SistemaDeBiblioteca {

    /**
     * Método principal que inicializa el sistema de biblioteca y realiza un
     * préstamo de prueba.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro miLibro = new Libro(192021921, "1986", "George Orwell");
        Usuario yo = new Usuario("Surky", "1506");
        LocalDate fechaDeHoy = LocalDate.now();
        
        miLibro.consultarDisponibilidad();
        Prestamo prestamo1 = new Prestamo(yo, miLibro, fechaDeHoy);
                
        prestamo1.prestarLibro();
        
        //consultando la disponibilidad
        miLibro.consultarDisponibilidad();
        
        yo.devolverLibro(miLibro);
        
        //consultando la disponibilidad
        miLibro.consultarDisponibilidad();

    }

}