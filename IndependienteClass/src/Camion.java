public class Camion extends Vehiculo {
    // Constructor
    public Camion(String marca, String modelo, int ano, int kilometraje) {
        super(marca, modelo, ano, kilometraje);
    }

    // Sobrescritura del método realizarMantenimiento
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento específico del camión.");
    }
}
