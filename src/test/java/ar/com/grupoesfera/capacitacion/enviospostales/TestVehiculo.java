package ar.com.grupoesfera.capacitacion.enviospostales;


import ar.com.grupoesfera.capacitacion.enviospostales.exception.PesoNoSoportadoException;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class TestVehiculo {

    @Test()
    public void debeFallarParaPesoMenorIgualOMenorACero() {
        Assertions.assertThatThrownBy(() -> FactoryVehiculo.create(-1))
                                     .isInstanceOf(PesoNoSoportadoException.class);
        Assertions.assertThatThrownBy(() -> FactoryVehiculo.create(0))
                .isInstanceOf(PesoNoSoportadoException.class);
    }
    /*
    @Test(expected = PesoNoSoportadoException.class)
    public void debeAsignarAutoParaPesoMenorA5() throws PesoNoSoportadoException{
        Assertions.assertThat(FactoryVehiculo.create(4)).isInstanceOf(Bicicleta.class);
    }

    */
}
