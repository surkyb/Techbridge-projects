/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_de_telefonia;

/**
 *
 * @author Gilber Vido 2025-2008
 */
public class Cliente {
    
    /**
     * Aqui declaramos nuestros atributos
     */
    private String nombre;
    private String numeroTel;
    private Plan plan;
    
    /**
     * Aqui creamos el constructor para poder agregarle datos
     * a nuestros atributos 
     * @param nombre
     * @param numeroTel
     * @param plan 
     */
    public Cliente(String nombre, String numeroTel, Plan plan)
    {
        this.nombre = nombre;
        this.numeroTel = numeroTel;
        this.plan = plan;
    }
    
    /**
     * Este es un metodo sencillo para retornar el nombre
     * @return nombre
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Este es otro metodo sencillo para retornar el numero telefonico
     * @return numeroTel
     */
    public String getNumeroTel()
    {
        return numeroTel;
    }
    
    /**
     * Este es otro metodo sencillo para retornar el plan 
     * @return plan
     */
    public Plan getPlan()
    {
        return plan;
    }
    
    /**
     * Aqui creo un meotodo con toString para poder plasmar todos
     * los datos de manera textual
     * @return Representacion textual del objeto
     */
    @Override
   
    public String toString()
    {
        return "Cliente: " + nombre +
               "\nNumero: " + numeroTel;
    }
}
