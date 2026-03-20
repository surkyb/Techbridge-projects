/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoramultifuncion;

/**
 * Clase que permite convertir temperaturas
 * entre grados Celsius y Fahrenheit.
 * @author Surky
 */
public class ConversorGrados {
    
    /**
     * Convierte una temperatura de Celsius a Fahrenheit.
     * @param valorAConvertir
     * @return 
     */
    public double celsiusAFarenheit(double valorAConvertir) {
  
        return (valorAConvertir * 1.8) + 32 ;
    }
    
    /**
     * Convierte una temperatura de Fahrenheit a Celsius.
     * @param valorAConvertir
     * @return 
     */
    public double fahrenheitACelsius(double valorAConvertir) {
        
        return (valorAConvertir - 32 ) / 1.8;
    }
}
