public class Auto extends Vehiculo {
  
    public Auto(String marca, String modelo, int ano, int kilometraje) {
        super(marca, modelo, ano, kilometraje);
    }

    
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento específico del auto.");
    }

   
    public double calcularCostoMantenimiento(double costoPorKm, int kilometrosRecorridos) {
        return costoPorKm * kilometrosRecorridos;
    }
}
