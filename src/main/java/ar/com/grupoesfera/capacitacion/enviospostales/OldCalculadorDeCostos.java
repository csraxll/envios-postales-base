package ar.com.grupoesfera.capacitacion.enviospostales;


import java.util.List;

public class OldCalculadorDeCostos {

    public static Float calcularCosto(List<Paquete> paquetes) {
        int size = paquetes.size();
        if (size < 5) {
            return 50f;
        } else if (size < 10){
            return 80f;
        } else {
            return  size * 15f;
        }
    }
}
