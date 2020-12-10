package ar.com.grupoesfera.capacitacion.enviospostales;


import ar.com.grupoesfera.capacitacion.enviospostales.exception.PesoNoSoportadoException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.when;

public class TestDespachador {

    Calculador calculadorDeCostos;
    Despachador despachador;
    List<Paquete> paquetes;
    Envio envio;

    @Test
    public void TestDespachador () {
        float costo = 50f;
        dadoUnDespachador();
        dadoQueExisteUnaListaDePaquetes();
        dadoQueLaListaContieneElPaquete(new Paquete(10f));
        dadoQueLaListaContieneElPaquete(new Paquete(10f));
        dadoQueLaListaContieneElPaquete(new Paquete(10f));
        dadoQueElCostoDelEnvioEs(costo);
        cuandoSeDespachaElEnvio();
        entoncesElEnvioTieneCosto(costo);
    }

    private void dadoUnDespachador(){
        calculadorDeCostos = Mockito.mock(Calculador.class);
        this.despachador = new Despachador(calculadorDeCostos);
    }

    private void dadoQueElCostoDelEnvioEs(float costo) {
        when(calculadorDeCostos.calcular(anyListOf(Paquete.class))).thenReturn(costo);
    }

    private void dadoQueExisteUnaListaDePaquetes() {
        paquetes = new ArrayList<Paquete>();
    }

    private void dadoQueLaListaContieneElPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    private void cuandoSeDespachaElEnvio() throws PesoNoSoportadoException {
        envio = despachador.despachar(paquetes, "dir");
    }

    private void entoncesElEnvioTieneCosto(float costo) {
        assertThat(envio.getCosto()).isEqualTo(costo);
    }


}
