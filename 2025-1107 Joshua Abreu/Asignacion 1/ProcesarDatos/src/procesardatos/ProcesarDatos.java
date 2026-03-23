/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesardatos;

/**
 *
 * @author Joshua Abreu
 */
public class ProcesarDatos {
   private String Matricula;
   private String Nombres;
   private String Apellidos;
   private String CuatriCursado;
   
   public void capturarDatos(String Matricula, String Nombres, String Apellidos, String CuatriCursado){
       this.Matricula = Matricula;
       this.Nombres = Nombres;
       this.Apellidos = Apellidos;
       this.CuatriCursado = CuatriCursado;
   }
   public String presentarDatos(){
       return "Matrícula: " + Matricula + "\nNombres: " + Nombres + "\nApellidos: " + Apellidos + "\nCuatrimestre: " + CuatriCursado;
   }

}
