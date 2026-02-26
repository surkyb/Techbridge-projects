/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3.pkg1;

/**
 *
 * @author Gilber Vido 2025-2008
 */

/**
 * Aqui utilizamos la palabra reservada "extends"
 * para asi poder heredar de la clase AutoMovil
 */
public class HondaCivic extends AutoMovil{
    
    /**
     * Aqui creamos el constructor vacio de esta
     * clase pero con la particularidad de que llamamos
     * el constructor vacio de la clase padre con la palabra
     * reservada "super"
     */
    public HondaCivic(){
        super();
        System.out.println("Constructor de HondaCivic");
    }
    
    @Override
    public void encenderAutoMovil(){
        System.out.println("El automovil Honda Civic esta encendiendo de manera excepcional");
    }
    
    @Override
    public void frenarAutoMovil(){
        System.out.println("El automovil Honda Civic frena con frenos deportivos...");
    }
}
