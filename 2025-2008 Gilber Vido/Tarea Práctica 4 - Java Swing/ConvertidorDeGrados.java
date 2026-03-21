/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_4_java_swing;

/**
 *
 * @author Gilber Vido   Matricula 2025-2008
 */
public class ConvertidorDeGrados {
    
    public double convertidorF(double gradoC ){
        return (gradoC * (9.0/5)) + 32;
    }
    
    public double convertidorC(double gradoF){
        return (gradoF - 32) * (5.0/9);
    }
    
}
