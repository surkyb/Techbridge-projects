/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

public class ProcesarDatos {
    // 1. Atributos (lo que la clase sabe)
    private String matricula, nombres, apellidos, cuatri;

    // 2. Método para Guardar (lo que la clase hace)
    public void capturarDatos(String mat, String nom, String ape, String cua) {
        this.matricula = mat;
        this.nombres = nom;
        this.apellidos = ape;
        this.cuatri = cua;
    }

    // 3. Método para Mostrar (lo que la clase responde)
    public String presentarDatos() {
        return "Matrícula: " + matricula + "\nNombre: " + nombres + " " + apellidos;
    }
} // <--- ESTA LLAVE CIERRA LA CLASE. ES VITAL.