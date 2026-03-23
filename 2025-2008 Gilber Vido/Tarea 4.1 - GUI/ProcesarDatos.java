/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg4.pkg1;

/**
 *
 * @author Gilber Vido 2025-2008
 */
public class ProcesarDatos {
    
    private String nombres;
    private String apellidos;
    private String matricula;
    private String cuatri;
    
    public void capturarDatos(String nombres, String apellidos, String matricula, String cuatri){
        
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.matricula = matricula;
        this.cuatri = cuatri;
    }
    
    public String presentarDatos(){
        return "Nombres: " + nombres + 
               "\nApellidos: " + apellidos +
               "\nMatricula: " + matricula + 
               "\nCuatrimestre: " + cuatri;
    }
}
