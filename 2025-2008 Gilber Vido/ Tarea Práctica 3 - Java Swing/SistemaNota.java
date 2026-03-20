/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemanota;

/**
 *
 * @author Gilber Vido Matricula 2025-2008
 */
public class SistemaNota {
    
    /*
    Nota: prac = practica, par = parcial, asig = asignacion y exam = examen
    */
    
    /**
     * Aqui creo este metodo booleano para poder verificar que las
     * notas que ingresen no pasen del maximo dado en la tarea 
     * utilizando unos if para la validacion 
     * @param prac
     * @param par
     * @param asig
     * @param exam
     *
     */
    
    public static boolean validarNotas(double prac, double par, double asig, double exam) {
        if (prac < 0 || prac > 40) return false;
        if (par < 0 || par > 20) return false;
        if (asig < 0 || asig > 20) return false;
        if (exam < 0 || exam > 20) return false;

        return true;
    }
    
    /**
     * Aqui paso a sumar las notas para poder tener la nota final y dar
     * el "Aprobado" o el "Reprobado" el el metodo siguiente
     * @param prac
     * @param par
     * @param asig
     * @param exam
     * @return prac + par + asig + exam
     */
    public static double calcularNotaFinal(double prac, double par, double asig, double exam) {

        return prac + par + asig + exam;
    }
        
    /**
    * Este metodo booleano lo utilizo para verificar si la nota
    * ya acumulada es suficiente para aprobar 
    * @param notaFinal
    */
    public static boolean esAprobado(double notaFinal) {
        return notaFinal >= 60;
    }
        
    /**
     * Este ultimo metodo simplemente es para mostarar los mensajes de dichas validaciones 
     * @param prac
     * @param par
     * @param asig
     * @param exam
     */
    public static String evaluarEstudiante(double prac, double par, double asig, double exam) {

        if (!validarNotas(prac, par, asig, exam)) {
            return "Notas fuera de rango";
        }

        double notaFinal = calcularNotaFinal(prac, par, asig, exam);

        if (esAprobado(notaFinal)) {
            return "Nota: " + notaFinal + " Aprobado";
        } else {
            return "Nota: "+ notaFinal + " Reprobado";
        }
    }
}

