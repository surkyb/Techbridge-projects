/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_de_telefonia;

/**
 *
 * @author Gilber Vido Matricula 2025-2008
 */
public class Factura {
    
    /**
     * Aqui declaramos nuestros atributos
     */
    private Cliente cliente;
    private int minutosConsumidos;
    private double datosConsumidos;
    private double cargoExtraMinutos;
    private double cargoExtraDatos;
    
    /**
     * Estas 2 constantes sirve para poder calcular el extra
     * de minutos y de GB
     */
    private static final double COSTO_MINUTO_EXTRA = 3.5;
    private static final double COSTO_GB_EXTRA = 50.0;
    
    /**
     * Aqui creamos el constructor para poder agregarle datos
     * a nuestros atributos
     * @param cliente
     * @param minutosConsumidos
     * @param datosConsumidos 
     */
    public Factura(Cliente cliente, int minutosConsumidos, double datosConsumidos)
    {
        this.cliente = cliente;
        this.minutosConsumidos = minutosConsumidos;
        this.datosConsumidos = datosConsumidos;
        calcularExcesos();
    }
    
    /**
     * Este metodo se encarga de calcular los cargos adicionales
     * cuando el consumo supera los limites del plan.
     * 
     * primero compara el consumo real con los minutos y datos incluidos
     * en el plan.
     * 
     * si existe el exceso, multiplica la diferenecia por la tarifa
     */
    private void calcularExcesos()
    {
        Plan plan = cliente.getPlan();

        if (minutosConsumidos > plan.getMinutosIncluidos()) {
            int excesoMinutos = minutosConsumidos - plan.getMinutosIncluidos();
            cargoExtraMinutos = excesoMinutos * COSTO_MINUTO_EXTRA;
        } else {
            cargoExtraMinutos = 0;
        }
        
         if (datosConsumidos > plan.getDatosIncluidos()) {
            double excesoDatos = datosConsumidos - plan.getDatosIncluidos();
            cargoExtraDatos = excesoDatos * COSTO_GB_EXTRA;
        } else {
            cargoExtraDatos = 0;
        }
    }
    /**
     * Este metodo calcula el monto total a pagar por el cliente
     * @return Monto total a pagar
     */
     public double calcularTotal() 
     {
        double precioBase = cliente.getPlan().getPrecioMensual();
        return precioBase + cargoExtraMinutos + cargoExtraDatos;
     }

     
     /**
      * Este metodo genera y muestra en la consola el resumen de la factura
      */
    public void generarFactura() 
    {

        System.out.println("===== FACTURA TELECOM =====");
        System.out.println(cliente);
        System.out.println("\n--- Plan contratado ---");
        System.out.println(cliente.getPlan());

        System.out.println("\n--- Consumo ---");
        System.out.println("Minutos usados: " + minutosConsumidos);
        System.out.println("Datos usados: " + datosConsumidos + " GB");

        System.out.println("\n--- Cargos extra ---");
        System.out.println("Cargo por minutos extra: RD$ " + cargoExtraMinutos);
        System.out.println("Cargo por datos extra: RD$ " + cargoExtraDatos);

        System.out.println("\nTOTAL A PAGAR: RD$ " + calcularTotal());
        System.out.println("==========================");
    }
    
}
