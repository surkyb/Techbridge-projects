/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_4_java_swing;

/**
 *
 * @author Gilber Vido 2025-2008
 */
public class Calculadora {
    
    public double sumar(double numeroA, double numeroB)
    {
        return numeroA+numeroB;
    }
    
    public double restar(double numeroA, double numeroB)
    {
        return numeroA-numeroB;
    }
    
    public double multiplicar(double numeroA, double numeroB)
    {
        return numeroA*numeroB;
    }
    
    public double dividir(double numeroA, double numeroB)
    {
        if (numeroB !=0)
        {
            return numeroA/numeroB;
        }
        else
        {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        
    }
}
