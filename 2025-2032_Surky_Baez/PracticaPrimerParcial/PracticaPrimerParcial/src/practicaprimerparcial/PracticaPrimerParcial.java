/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaprimerparcial;

import java.util.Scanner;

/**
 *
 * @author SurkyBaez 2025-2032
 */
public class PracticaPrimerParcial {
    /**
     * Permite interactuar con el usuario.
     * mediante un menú para realizar operaciones matemáticas básicas utilizando la clase
     * CalculadoraMatematica.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        CalculadoraMatematica calculadoraMatematica = new CalculadoraMatematica();
        
        int opcionMenu = 0;
        
        do {
            
            //menú
            
            System.out.println("===== CALCULADORA MATEMÁTICA =====");
            System.out.println("1. Insertar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opción:");
            opcionMenu = sc.nextInt();
            
            // Switch para manejar las opciones del menú
            
            switch(opcionMenu){
                
                case 1: 
                    // Solicita los números al usuario
                    System.out.print("INGRESA TU PRIMER NUMERO: ");
                    double numero1 = sc.nextDouble();
                    
                    System.out.print("INGRESA TU SEGUNDO NUMERO: ");
                    double numero2 = sc.nextDouble();
                    
                    // Guarda los números en la calculadora
                    calculadoraMatematica.setNumeros(numero1, numero2);
                    System.out.println("Números ingresados correctamente.");
                    break;
                case 2:
                    System.out.println("Resultado de la suma " + calculadoraMatematica.calcularSuma() );
                    break;
                case 3: 
                    System.out.println("Resultado de la resta " + calculadoraMatematica.calcularResta());
                    break;
                case 4: 
                    System.out.println("Resultado de la multiplicacion " + calculadoraMatematica.calcularMultiplicacion());
                    break;
                case 5: 
                    System.out.println("Resultado de la Division " + calculadoraMatematica.calcularDivision());
                    break;
                case 0:
                    System.out.println("¡Gracias por usar la calculadora!");
                    break;
                default:
                break;
            }
        } while (opcionMenu != 0);
        
    }
    
}


