/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
import java.util.Scanner;

public class practicaprimerparcial {

    private double numero1;
    private double numero2;

    public practicaprimerparcial() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public void establecerNumeros(double n1, double n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraMatematica miCalc = new CalculadoraMatematica();
        int opcionMenu;

        do {
            System.out.println("===== CALCULADORA MATEMATICA =====");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    double n2 = sc.nextDouble();
                    miCalc.establecerNumeros(n1, n2);
                    System.out.println("Numeros actualizados.");
                    break;
                case 2:
                    System.out.println("Resultado suma: " + miCalc.sumar());
                    break;
                case 3:
                    System.out.println("Resultado resta: " + miCalc.restar());
                    break;
                case 4:
                    System.out.println("Resultado multiplicacion: " + miCalc.multiplicar());
                    break;
                case 5:
                    System.out.println("Resultado division: " + miCalc.dividir());
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
            System.out.println();
        } while (opcionMenu != 0);

        sc.close();
    }
}
