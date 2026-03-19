/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asignacion3_1;

/**
 *
 * @author Joshua Abreu
 */
//La clase HondaCivic hereda de la clase AutoMovil
public class HondaCivic extends AutoMovil {
    
    // Constructor de la clase HondaCivic
    public HondaCivic(){
        // Llama al constructor de la clase padre (AutoMovil)
        super();
        // Mensaje que se muestra al crear un objeto HondaCivic
        System.out.println("Constructor de HondaCivic");
    }

    // Sobrescribe el método frenar de la clase AutoMovil
    @Override
    public void frenar() {
        // Mensaje específico para el Honda Civic
        System.out.println("El Honda Civic esta frenando en la calle...");
    }

    // Sobrescribe el método apagar de la clase AutoMovil
    @Override
    public void apagar() {
        // Mensaje específico para el Honda Civic
        System.out.println("El Honda Civic se esta apagando en la calle");
    }     
}
