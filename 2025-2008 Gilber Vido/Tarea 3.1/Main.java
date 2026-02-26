/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg3.pkg1;

/**
 *
 * @author Gilber Vido Matricula 2025-2008
 */
public class Main {

    /**
     * Creamos este Main para poder probar lo ya hecho
     */
    public static void main(String[] args) {
        
        /**
         * Aqui creamos las instancias de AutoMovil
         */
        AutoMovil auto = new AutoMovil();
        auto.setMarca("Kia");
        auto.setModelo("Picanto");
        auto.setAño(2025);
        auto.setColor("Negro");
        
        System.out.println("== ESPECIFICACIONES ==");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Año: " + auto.getAño());
        System.out.println("Color: " + auto.getColor());
        System.out.println("======================");
        /**
         * Aqui llamamos los metodos de AutoMovil
         */
        auto.encenderAutoMovil();
        auto.acelerarAutoMovil();
        auto.frenarAutoMovil();
        auto.apagarAutoMovil();
        
        /**
         * Aqui creamos las instancias de HondaCivic
         */
        
        System.out.println("\n== ESPECIFICACIONES HONDA ==");
        HondaCivic honda = new HondaCivic();
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setAño(2025);
        honda.setColor("Blanco");
        System.out.println("Marca: " + honda.getMarca());
        System.out.println("Modelo: " + honda.getModelo());
        System.out.println("Año: " + honda.getAño());
        System.out.println("Color: " + honda.getColor());
        System.out.println("===============================");
        
        /**
         * Aqui llamamos los metodos de la clase padre y los
         * sobrescritos en la clase hija
         */
        honda.encenderAutoMovil(); //Este es el sobrescrito
        honda.acelerarAutoMovil();
        honda.frenarAutoMovil(); // Este es el otro sobrescrito
        honda.apagarAutoMovil();
    }
}
