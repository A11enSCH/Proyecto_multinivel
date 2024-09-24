package Modelo;

public class Vehiculo{
    
    private String matricula;
    private String marca;
    private String color;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehiculo(String matricula, String marca, String color, String tipo) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
    }

    
    
}
