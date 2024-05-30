public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Auto miAuto = new Auto("Toyota", "Corolla", 2020, 50000);
        miAuto.realizarMantenimiento();
        double costoMantenimiento = miAuto.calcularCostoMantenimiento(0.10, 50000);
        System.out.println("Costo de mantenimiento del auto: " + costoMantenimiento);

        Camion miCamion = new Camion("Volvo", "VNL", 2018, 150000);
        miCamion.realizarMantenimiento();
    }
}

