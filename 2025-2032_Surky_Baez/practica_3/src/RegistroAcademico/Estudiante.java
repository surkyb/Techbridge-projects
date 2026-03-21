/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroAcademico;

/**
 * Clase que representa un estudiante y permite calcular
 * su nota final y determinar si aprobó o reprobó.
 */
public class Estudiante {

    private String nombreCompleto, matricula, carrera;

    private double practicas, parciales, asignaciones, examenFinal;

    public Estudiante(String nombreCompleto, String matricula, String carrera,
            double practicas, double parciales, double asignaciones, double examenFinal) {

        this.nombreCompleto = nombreCompleto;
        this.matricula = matricula;
        this.carrera = carrera;

        this.practicas = practicas;
        this.parciales = parciales;
        this.asignaciones = asignaciones;
        this.examenFinal = examenFinal;
    }

    /**
     * Calcula la nota final sumando todas las calificaciones.
     *
     * @return la nota total del estudiante
     */
    public double calcularNota() {
        return practicas + parciales + asignaciones + examenFinal;
    }

    public String obtenerResultado() {
        if (calcularNota() >= 60) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }

}
