package Modelo;

public class Poliza {
    private String id;
    private String fecha;
    private Double valor_a;
    private Poliza[] polizas;

    public Poliza[] getPolizas() {
        return polizas;
    }

    public void setPolizas(Poliza[] polizas) {
        this.polizas = polizas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getValor_a() {
        return valor_a;
    }

    public void setValor_a(Double valor_a) {
        this.valor_a = valor_a;
    }

    public Poliza(String id, String fecha, Double valor_a) {
        this.id = id;
        this.fecha = fecha;
        this.valor_a = valor_a;
    }
    
    
}
