/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asignacion2._clases_metodos;

/**
 *
 * @author Joshua Abreu
 */
public class TV {
    //Variables de la clase
    String marca;
    int pulgadas;
    boolean encendido;
    int volumen;

    public static void main(String[] args) {
        
    }
    //Metodo encender
    public static void encender(){
        System.out.println("La TV se esta encendiendo");
    }
    //Metodo apagar
    public static void apagar(){
        System.out.println("La TV se esta apagando");
    }
    //Metodo subir volumen
    public static void subirVolumen(){
        System.out.println("Subiendo el volumen de la TV");
    }
    //Metodo bajar volumen
    public static void bajarVolumen(){
        System.out.println("Bajando el volumen de la TV");
    }
}
