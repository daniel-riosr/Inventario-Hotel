package Habitaciones;

public class Hotel {
    private Habitacion[] habitaciones;
    private  int TOTAL_HABITACIONES = 60;
    private  int INDIVIDUALES_DISPONIBLES = 10;
    private  int PAREJAS_DISPONIBLES = 10;
    private  int MATRIMONIO_DISPONIBLES = 20;
    private  int FAMILIARES_DISPONIBLES = 20;

    public Hotel() {
        this.habitaciones = new Habitacion[TOTAL_HABITACIONES];
    }

    public int obtenerIndividualesDisponibles() {
        return INDIVIDUALES_DISPONIBLES;
    }

    public int obtenerParejasDisponibles() {
        return PAREJAS_DISPONIBLES;
    }

    public int obtenerMatrimonioDisponibles() {
        return MATRIMONIO_DISPONIBLES;
    }

    public int obtenerFamiliaresDisponibles() {
        return FAMILIARES_DISPONIBLES;
    }
}
