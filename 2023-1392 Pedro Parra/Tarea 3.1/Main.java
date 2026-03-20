/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class Main {
    public static void main(String[] args) {

        HondaCivic civic = new HondaCivic();

        civic.setMarca("Honda");
        civic.setModelo("Civic");
        civic.setAnio(2022);
        civic.setColor("Negro");

        System.out.println("Marca: " + civic.getMarca());
        System.out.println("Modelo: " + civic.getModelo());

        civic.encender();
        civic.acelerar();
        civic.frenar();
        civic.apagar();
    }
}
