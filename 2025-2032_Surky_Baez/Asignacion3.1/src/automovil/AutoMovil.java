/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil;

/**
 *
 * @author Surky
 */
public class AutoMovil {

   private String marca;
   private String modelo;
   private int año;
   private String color;
   
   
   public AutoMovil(){
       System.out.println("Constructor de AutoMóvil");
   }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
   //getters y setters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }
   

   // metodos
   
   public void encender()
   {
       System.out.println(" El automovil está encendiendo ");
   }
   public void apagar()
   {
       System.out.println(" El automovil está apagandose ");
   }
   public void acelerar()
   {
       System.out.println(" El automovil está acelerando ");
   }
   public void frenar()
   {
       System.out.println(" El automovil está frenando ");
   }
   
   
}
