package ar.com.grupoesfera.capacitacion.enviospostales;


import ar.com.grupoesfera.capacitacion.enviospostales.exception.PesoNoSoportadoException;
//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.List;

public class Despachador {

    private Integer enviosRealizados = 0;
    //private Logger log = LoggerFactory.getLogger(Despachador.class);
    private Calculador calculadorDeCostos;

    public Despachador(Calculador calculadorDeCostos) {
        this.calculadorDeCostos = calculadorDeCostos;
    }

    public Envio despachar(List<Paquete> paquetes, String direccion) throws PesoNoSoportadoException{
        Float costo = calculadorDeCostos.calcular(paquetes);
        Float costoAdicional = (enviosRealizados > 10) ? costo * 0.1f : 0;
        Envio envio = new Envio(paquetes,
                          costo + costoAdicional,
                                direccion,
                                FactoryVehiculo.create(paquetes));
        enviosRealizados += 1;
        return envio;
    }
}
