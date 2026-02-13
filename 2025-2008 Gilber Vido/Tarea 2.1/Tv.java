/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tv;

/**
 *
 * @author Gilber Vido
 */
public class Tv {
    
    /**
     * Aqui paso a crear los atributos de la clase tv,
     * publicos para asi poder acceder a ellos desde otra clase
     */
    public String marca;
    public int pulgadas;
    public int precio;
    public int volumen;
    
    
    /**
     * Este meotodo es uno de los recomendados.
     * @return un mensaje indicando que esta encendido.
     */
     public void encender()
     {
         System.out.println("La TV se esta encendiendo...");
         
     }
     
     
     /**
      * Este es otro de los metodos recomendados.
      * @return Un mensaje indica que se esta apagando.
      */
     public void apagar()
     {
         System.out.println("La TV se esta apagando...");
         
         
     }
     
     /**
      * Este es otro de los metodos recomendados.
      * @return Un mensaje que indica que se esta subiendo el volumen
      */
     public void subirVolumen()
     {
         System.out.println("Subiendo el volumen...");
         
     }
     
     
     /**
      * Este es uno de los metodos recomendados.
      * @return Un mensaje que indica que se esta bajando el volumen
      */
     public void bajarVolumen()
     {
         System.out.println("Bajando el volumen...");
     }
}
