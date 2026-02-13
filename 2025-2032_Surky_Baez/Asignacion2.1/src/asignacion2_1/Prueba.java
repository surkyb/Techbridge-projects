/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asignacion2_1;
/**
 * @author Surky
 */
public class Prueba {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // creando instancias
        
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();

        // Asignando valores a la primera instancia 
        
        tv1.marca = "Samsung";
        tv1.pulgadas = 55;
        tv1.volumen = 20;

        // Asignando valores a la segunda instancia 
        
        tv2.marca = "LG";
        tv2.pulgadas = 43;
        tv2.volumen = 15;

        // Asignando valores a la tercera instancia 
        
        tv3.marca = "TCL";
        tv3.pulgadas = 30;
        tv3.volumen = 70;
        
        //invocando a los metodos de la primera instancia
        
        System.out.println("=== TV 1 ===");
        System.out.println("Marca: " + tv1.marca);
        System.out.println("Pulgadas: " + tv1.pulgadas);
        System.out.println("Volumen: " + tv1.volumen);
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();
        
        //invocando a los metodos de la segunda instancia
        
        System.out.println("=== TV 2 ===");
        System.out.println("Marca: " + tv2.marca);
        System.out.println("Pulgadas: " + tv2.pulgadas);
        System.out.println("Volumen: " + tv2.volumen);
        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();
        
        //invocando a los metodos de la tercera instancia
        
        System.out.println("=== TV 3 ===");
        System.out.println("Marca: " + tv3.marca);
        System.out.println("Pulgadas: " + tv3.pulgadas);
        System.out.println("Volumen: " + tv3.volumen);
        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
    }   
}