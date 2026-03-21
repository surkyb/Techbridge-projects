/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroacademico;

/**
 *
 * @author Pedro
 */
public class CalculadoraNotas {

    public static double calcularNotaFinal(Estudiante e) {
        return e.getPracticas()
                + e.getParciales()
                + e.getAsignaciones()
                + e.getExamenFinal();
    }

    public static String estadoAcademico(double notaFinal) {
        return (notaFinal >= 60) ? "APROBADO" : "REPROBADO";
    }
}
