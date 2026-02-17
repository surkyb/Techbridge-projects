/**
 * Representa al cliente asociado a un plan.
 */
public class Cliente {
    private String nombre;
    private String telefono;
    private Plan plan;

    public Cliente(String nombre, String telefono, Plan plan) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.plan = plan;
    }

    public String getNombre() { return nombre; }
    public Plan getPlan() { return plan; }
}