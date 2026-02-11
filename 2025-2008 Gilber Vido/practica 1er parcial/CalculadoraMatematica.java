/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
    Esta es la practica 2 - 1er Parcial de Gilber
Matricula: 2025-2008
*/
package com.mycompany.calculadoramatematica;

import java.util.Scanner;

/**
 *
 * @author Gilber Vido
 */

/**
 * 
 * Hago la clase principal para esta practica
 */
public class CalculadoraMatematica {
    // Aqui creamos los atributos privados de la clase//
    private double numero1;
    private double numero2;
    
    
    Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        
        /*Este scanner es para poder recibir la informacion del usuario,
          ya sea su decision o los numeros dados*/
        Scanner tc = new Scanner(System.in);
        
        
        /* Aqui creo un objeto para poder usar los atributos y metodos
        no estaticos de mi clase*/
        CalculadoraMatematica calcu = new CalculadoraMatematica();
        /*
        Cree esta variable para leer a la hora de utilizar el switch,
        en base a lo que elija el usuario.
        */
       int menu;
       
        //Este es un menu sencillo // 
        System.out.println("\n===== CALCULADORA MATEMATICA =====");
        System.out.println("\n1. Ingresar numeros");
        System.out.println("2. Sumar ");
        System.out.println("3. Resta");
        System.out.println("4. Multiplicar");
        System.out.println("5. Dividir");
        System.out.println("0. Salir");
        System.out.println("\n==================================");
        
       /* El do-while es para que a la hora de pedir una
        opcion y el switch se puedan repetir hasta que el 
        usuario inserte la opcion de salida*/
       do
       {
           /* puse esta parte separado del menu para que solo se 
              se repita esto, asi estara mas limpia la consola*/
        System.out.println("\n Seleccione una opcion: ");
        menu = tc.nextInt();
        
        /*El switch sirve para que, dependiendo lo que el usuario ponga,
        el programa ejecute una accion o otra. */
        switch(menu)
        {
            case 1:
                System.out.println("Ingresa el primer numero :)");
                double numero1 = tc.nextDouble();
                System.out.println("Ingresa el segundo numero :)");
                double numero2 = tc.nextDouble();
                
                //Aqui agrego los numeros en el metodo//
                calcu.ingresarNumeros(numero1, numero2);
                System.out.println("\nNumeros agregados correctamente");
                break;
            
            case 2:
                System.out.println("Resultado de la suma: " + calcu.calcularSuma());
                break;
            
            case 3: 
                System.out.println("Resultado de la resta: " + calcu.calcularResta());
                break;
                
            case 4: 
                System.out.println("Resultado de la multiplicacion: " + calcu.calcularMultiplicacion());
                break;
               
            case 5:
                System.out.println("Resultado de la division: " + calcu.calcularDivision());
                break;
                
            default:
                System.out.println("\nGracias por usar mi calculadora :))");
                
        }
        
       } while (menu !=0);
    }
    
    
    /**
    * En este metodo lo que se espera es poder agregar los numeros en 
    * la variable privada de la clase, por eso uso el this.
    */
    public void ingresarNumeros(double numero1, double numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    /**
    * En este otro metodo lo que se espera es que haga la operacion de suma
    * @return el resultado de esta.
    */
    public double calcularSuma()
    {
        return numero1 + numero2;
    }
    
    /**
    * Este tiene el mismo funcionamiento logico que el anterior
    * @return el resultado de la resta.
    */
    public double calcularResta()
    {
        return numero1 - numero2;
    }
    
    /**
    * Este tiene el mismo funcionamiento logico que el anterior
    * @return el resultado de la multiplicacion.
    */
    public double calcularMultiplicacion()
    {
        return numero1 * numero2;
    }
    
    /**
    * Este metodo tiene el mismo funcionamiento logico que el anterior, aunque
    * esta tiene una particularidad que es que primero verifica si se cumple
    * la condicion (En este caso es que en la variable "numero2" no se encuentre
    * un cero) para luego retornar el resultado, si no es asi solo retorna un mensaje.
    * @return El resultado de la division (si la condicion se cumple) o un mensaje.
    */
    
    public double calcularDivision()
    {
        if (numero2 != 0)
        {
            return numero1 / numero2;
        }
        else
        {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
    }
    
}
