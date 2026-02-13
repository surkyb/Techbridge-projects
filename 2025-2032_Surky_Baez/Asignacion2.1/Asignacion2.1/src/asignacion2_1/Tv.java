/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacion2_1;
/**
 * @author Surky
 */
public class Tv{
    
    public String marca;
    public int pulgadas;
    public boolean encendido;
    public int volumen;
    
    public Tv(){}
    
    public Tv(String marca, int pulgadas, int volumen){
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.encendido = false;
        this.volumen = volumen;
    }
    
    public void encender(){
        System.out.println("La TV se está encendiendo...");
    }
    
    public void apagar(){
        System.out.println("La TV se está apagando...");
    }
    
    public void subirVolumen(){
        System.out.println("Subiendo el volumen...");
    }
    
    public void bajarVolumen(){
        System.out.println("Bajando el volumen...");
    }
}
