/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3.pkg1;

/**
 *
 * @author Gilber Vido Matricula 2025-2008
 */
public class AutoMovil {
    
    /**
     * Aqui declaramos nuestros atributos que utilizaremos
     * en nuestro proyectos.
     */
    private String marca;
    private String modelo;
    private int año;
    private String color;
    
    /**
     * Aqui creamos el constructor vacio que solo imprima un mensaje
     */
    public AutoMovil(){
        System.out.println("Constructor de AutoMovil");
    }
    
    /**
     * Aqui creamos los getters y setters para 
     * terminar de aplicar el encapsulamiento
     * @return marca, modelo, año y color
     */
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }
    
    public void setAño(int año){
        this.año = año;
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    /**
     * Aqui creamos los metodos de esta clase 
     * los cuales solo imprimeran un mensaje cuando
     * los llamemos.
     */
    public void encenderAutoMovil(){
        System.out.println("El automovil esta encendiendo...");
    }
    
    public void apagarAutoMovil(){
        System.out.println("El automovil se esta apagando...");
    }
    
    public void acelerarAutoMovil(){
        System.out.println("El automovil se esta acelerando...");
    }
    
    public void frenarAutoMovil(){
        System.out.println("El automovil esta frenando...");
    }
}
