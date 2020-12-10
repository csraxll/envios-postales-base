package ar.com.grupoesfera.capacitacion.enviospostales;


import java.util.List;

public class Envio {

    private List<Paquete> paquetes;
    private Float costo;
    private String direccion;
    private Vehiculo transporte;

    public Envio(List<Paquete> paquetes, Float costo, String direccion, Vehiculo transporte) {
        this.paquetes = paquetes;
        this.costo = costo;
        this.direccion = direccion;
        this.transporte = transporte;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public Float getCosto() {
        return costo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Vehiculo getTransporte() {
        return transporte;
    }
}
