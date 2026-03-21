/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package registroacademico;

/**
 *
 * @author Pedro
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RegistroAcademicoGUI extends JFrame {

    private JTextField txtNombre, txtMatricula, txtCarrera;
    private JTextField txtPracticas, txtParciales, txtAsignaciones, txtExamen;
    private JLabel lblResultado;

    public RegistroAcademicoGUI() {

        setTitle("Registro Académico");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(10,2,5,5));

        // Datos personales
        add(new JLabel("Nombre Completo:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Matrícula:"));
        txtMatricula = new JTextField();
        add(txtMatricula);

        add(new JLabel("Carrera:"));
        txtCarrera = new JTextField();
        add(txtCarrera);

        // Notas
        add(new JLabel("Prácticas (0-40):"));
        txtPracticas = new JTextField();
        add(txtPracticas);

        add(new JLabel("Parciales (0-20):"));
        txtParciales = new JTextField();
        add(txtParciales);

        add(new JLabel("Asignaciones (0-20):"));
        txtAsignaciones = new JTextField();
        add(txtAsignaciones);

        add(new JLabel("Examen Final (0-20):"));
        txtExamen = new JTextField();
        add(txtExamen);

        JButton btnCalcular = new JButton("Calcular Resultado");
        add(btnCalcular);

        lblResultado = new JLabel("");
        add(lblResultado);

        btnCalcular.addActionListener(this::calcularResultado);

        setVisible(true);
    }

    private void calcularResultado(ActionEvent e) {

        try {

            if(txtNombre.getText().isEmpty() ||
               txtMatricula.getText().isEmpty() ||
               txtCarrera.getText().isEmpty()) {

                throw new Exception("Complete todos los campos.");
            }

            double practicas = Double.parseDouble(txtPracticas.getText());
            double parciales = Double.parseDouble(txtParciales.getText());
            double asignaciones = Double.parseDouble(txtAsignaciones.getText());
            double examen = Double.parseDouble(txtExamen.getText());

            validarRango(practicas,0,40,"Prácticas");
            validarRango(parciales,0,20,"Parciales");
            validarRango(asignaciones,0,20,"Asignaciones");
            validarRango(examen,0,20,"Examen Final");

            Estudiante est = new Estudiante(
                    txtNombre.getText(),
                    txtMatricula.getText(),
                    txtCarrera.getText(),
                    practicas, parciales,
                    asignaciones, examen
            );

            double notaFinal = CalculadoraNotas.calcularNotaFinal(est);
            String estado = CalculadoraNotas.estadoAcademico(notaFinal);

            lblResultado.setText(
                    "Nota Final: " + notaFinal + " - " + estado
            );

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Solo se permiten números.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Validación",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void validarRango(double valor, double min, double max, String campo) throws Exception {
        if(valor < min || valor > max)
            throw new Exception(campo + " fuera de rango.");
    }
}
