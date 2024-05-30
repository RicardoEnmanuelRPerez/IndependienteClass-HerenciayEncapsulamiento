public class Vehiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int kilometraje;

  
    public Vehiculo(String marca, String modelo, int ano, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometraje = kilometraje;
    }

   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

   
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento básico del vehículo.");
    }
}
