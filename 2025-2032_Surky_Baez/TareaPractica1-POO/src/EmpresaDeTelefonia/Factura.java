/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpresaDeTelefonia;

/**
 * Representa una factura de un cliente, registrando consumo real y cargos
 * extras Calcula automáticamente los cargos por exceso de minutos y datos, así
 * como el total de la factura.
 * @author UserGPC
 */
public class Factura {

    private Cliente cliente;
    private int minutosUsados;
    private float datosUsados;
    private double cargosExtra;
    private double montoTotal;

    /**
     * Constructor de la factura. Calcula automáticamente los cargos extras y el
     * monto total.
     *
     * @param cliente cliente al que se le genera la factura
     * @param minutosUsados minutos efectivamente consumidos
     * @param datosUsados datos efectivamente consumidos en GB
     */
    public Factura(Cliente cliente, int minutosUsados, float datosUsados) {
        this.minutosUsados = minutosUsados;
        this.datosUsados = datosUsados;
        this.cliente = cliente;
        this.cargosExtra = devolverCargoExtra();
        this.montoTotal = calcularMontoTotal();
    }

    /**
     * Calcula los cargos extras por exceso de consumo. Cada minuto extra cuesta
     * 5$, cada GB extra cuesta 10$.
     *
     * @return total de cargos extras
     */
    private double devolverCargoExtra() {
        Plan plan = cliente.getPlan();
        double extra = 0;

        // el exceso será los datos usados restandole los minutos disponibles en el plan
        float excesoDatos = datosUsados - plan.getDatosIncluidos();

        // el exceso será los minutos usados restandole los minutos disponibles en el plan
        int excesoMinutos = minutosUsados - plan.getMinutosIncluidos();

        if (excesoDatos > 0) {
            extra += excesoDatos * 10; // cada gb excedente cuesta 10 pesos
        }

        if (excesoMinutos > 0) {
            extra += excesoMinutos * 5; // cada minuto excedente cuesta 5 pesos
        }

        return extra;

    }

    /**
     * Calcula el monto total de la factura sumando el precio base del plan y
     * los cargos extras.
     *
     * @return monto total de la factura
     */
    private double calcularMontoTotal() {
        return cliente.getPlan().getPrecioMensual() + cargosExtra;
    }

    /**
     * Genera e imprime un resumen detallado de la factura. Incluye información
     * del cliente, plan, uso real y cargos extras.
     */
    public void generarFactura() {
        System.out.println("========== FACTURA ========== ");
        System.out.println("Factura a nombre de " + cliente.getNombre());
        System.out.println("Numero correspondiente: " + cliente.getNumero());
        System.out.println("\t----- Plan -----");
        System.out.println("Minutos Incluidos: " + cliente.getPlan().getMinutosIncluidos() + "min");
        System.out.println("Datos Incluidos: " + cliente.getPlan().getDatosIncluidos() + "GB");
        System.out.println("Precio Mensual: " + cliente.getPlan().getPrecioMensual() + "$");
        System.out.println("\t----- USO -----");
        System.out.println("Minutos usados " + minutosUsados + "min");
        System.out.println("Datos usados " + datosUsados + "GB");
        System.out.println("Cargos extra " + cargosExtra + "$");
        System.out.println("-------------------------------");
        System.out.println("TOTAL: " + montoTotal + "$");
    }
}

