public class MiniBus extends Bus {

    private String tipoViaje;

    public MiniBus() {
        // Constructor vacío
    }

    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public String imprimeBus() {
        return String.format(
                "Color: %s\n" +
                        "Patente: %s\n" +
                        "Cantidad de Asientos: %d\n" +
                        "Asientos Disponibles: %d\n" +
                        "Tipo de Viaje: %s\n",
                super.getColor(),
                super.getPatente(),
                super.getCantidadDeAsientos(),
                super.asientosDisponibles(),
                tipoViaje
        );
    }
}

