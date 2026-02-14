/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpresaDeTelefonia;

/**
 * Clase principal que representa una empresa de telefonía y prueba el sistema
 * de facturación. Crea un cliente, un plan y genera una factura mostrando un
 * resumen detallado.
 *
 * @author SurkyBaez
 */
public class EmpresaDeTelefonia {

    public static void main(String[] args) {

        //creamos un objeto cliente usando la sobrecarga de plan para crear un plan de 100 minutos y 50gb
        Cliente miCliente = new Cliente("Victor", "8298908030", new Plan(100, 50));
        Factura factura1 = new Factura(miCliente, 120, 55);

        // creamos una factura para el cliente
        factura1.generarFactura();

        //aqui creamos otro obj cliente con el constructor para plan basico
        var miCliente2 = new Cliente("Nicole", "8907896789", new Plan());
        Factura NicoleFact1 = new Factura(miCliente2, 200, 20);

        NicoleFact1.generarFactura();

    }

}
