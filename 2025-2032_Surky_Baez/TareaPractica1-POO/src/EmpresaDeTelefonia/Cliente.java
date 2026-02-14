/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpresaDeTelefonia;

/**
 *
 * @author UserGPC
 */
/**
 * Representa un cliente de la empresa de telefonía. Cada cliente tiene un
 * nombre, un número telefónico y un plan asociado.
 */
public class Cliente {

    private String nombre;
    private String numeroTelefonico;
    private Plan plan;

    /**
     * Constructor que crea un cliente con su nombre, número y plan.
     *
     * @param nombre nombre del cliente
     * @param numero número telefónico del cliente
     * @param plan plan asociado al cliente
     */
    public Cliente(String nombre, String numero, Plan plan) {
        this.nombre = nombre;
        this.numeroTelefonico = numero;
        this.plan = plan;
    }

    /**
     * Devuelve el nombre el cliente
     * @return nombre del cliente como String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el número telefónico del cliente
     * @return número de teléfono como String
     */
    public String getNumero() {
        return numeroTelefonico;
    }

    /**
     * Devuelve el plan asociado al cliente
     * @return objeto Plan asociado al cliente
     */
    public Plan getPlan() {
        return plan;
    }

}