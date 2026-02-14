/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_de_telefonia;

/**
 *
 * @author Joshua Abreu
 */
public class Factura {
   //Atributos de la clase Factura
   // Cliente al que pertenece la factura
   private Clientes cliente;
   private int minutosUsados;
   private int datosUsados;
   
   /**
    * Constructor que crea una factura con el cliente y su consumo.
    * 
    * @param cliente cliente al que se le genera la factura
    * @param minutosUsados cantidad de minutos consumidos
    * @param datosUsados cantidad de datos consumidos en GB
    */
   Factura(Clientes cliente, int minutosUsados, int datosUsados){
       this.cliente = cliente;
       this.minutosUsados = minutosUsados;
       this.datosUsados = datosUsados;
   }
   
   /**
    * Calcula el monto total a pagar por el cliente.
    * El total incluye el precio base del plan más
    * los cargos adicionales por exceso de minutos y datos.
    * 
    * @return monto total a pagar
    */
   public double calcularTotal(){
       Plan plan = cliente.getPlan();
       double total = plan.getPrecioMensual();
       
       // Cálculo de cargos por minutos extra
       if(minutosUsados > plan.getMinutosIncluidos()){
           int minutosExtra = minutosUsados - plan.getMinutosIncluidos();
           total += minutosExtra * 3;  //3 pesos por minutos extra
       }
       
        // Cálculo de cargos por datos extra
       if(datosUsados > plan.getDatosGB()){
           int datosExtra = datosUsados - plan.getDatosGB();
           total += datosExtra * 60; //60 pesos por GB estra
       }
       return total;
   }
   
   // Muestra en pantalla un resumen detallado de la factura
   public void generarFactura(){
       Plan plan = cliente.getPlan();
       
       System.out.println("==== FACTURA GENERADA ====");
       System.out.println("Cliente: " + cliente.getNombre());
       System.out.println("Telefono: " + cliente.getNumeroTelefonico());
       System.out.println("Precio Base " + plan.getPrecioMensual());
       System.out.println("Minutos Usados: " + minutosUsados);
       System.out.println("Datos Usados: " + datosUsados + " GB");
       System.out.println("Total a pagar: $" + calcularTotal());      
   } 
}
