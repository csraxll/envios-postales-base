package ar.com.grupoesfera.capacitacion.enviospostales;

public class Vehiculo {

    /*
    public static class FactoryVehiculo {

        public static Vehiculo create(Integer peso) throws PesoNoSoportadoException {
            if (peso <= 0 || peso > 150) {
                throw new PesoNoSoportadoException();
            } else if (peso <= 5) {
                return new Bicicleta();
            } else if (peso <= 50) {
                return new Auto();
            } else {
                return new Camion();
            }
        }

        public static Vehiculo create(List<Paquete> paquetes) throws PesoNoSoportadoException {
            int peso = 0;
            for (Paquete paquete: paquetes) {
                peso += paquete.getPeso();
            }
            return create(peso);
        }
    }
    */
}
