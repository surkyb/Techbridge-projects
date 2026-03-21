/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package registroacademico;

/**
 *
 * @author Pedro
 */
public class Estudiante {

    private String nombre;
    private String matricula;
    private String carrera;

    private double practicas;
    private double parciales;
    private double asignaciones;
    private double examenFinal;

    public Estudiante(String nombre, String matricula, String carrera,
                      double practicas, double parciales,
                      double asignaciones, double examenFinal) {

        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.practicas = practicas;
        this.parciales = parciales;
        this.asignaciones = asignaciones;
        this.examenFinal = examenFinal;
    }

    public double getPracticas() { return practicas; }
    public double getParciales() { return parciales; }
    public double getAsignaciones() { return asignaciones; }
    public double getExamenFinal() { return examenFinal; }
}