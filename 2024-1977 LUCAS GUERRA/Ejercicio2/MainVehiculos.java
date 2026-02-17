public class MainVehiculos {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("A-123", "Toyota", "Corolla");
        Vehiculo v2 = new Vehiculo("B-999"); // Prueba constructor básico

        System.out.println("Mantenimiento v1 (solo km): $" + v1.calcularMantenimiento(1000));
        System.out.println("Mantenimiento v1 (km + aceite): $" + v1.calcularMantenimiento(1000, "aceite"));
    }
}