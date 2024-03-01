package Habitaciones;


public class Habitacion {
    public String tipo;
    public int capacidad;
    public boolean disponible;
    public int toallas;
    public int sabanas;
    public int muebles;

    public Habitacion(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.disponible = true;
        this.toallas = 0;
        this.sabanas = 0;
        this.muebles = 0;
    }
       
    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public int getToallas() {
        return toallas;
    }

    public void setToallas(int toallas) {
        this.toallas = toallas;
    }

    public int getSabanas() {
        return sabanas;
    }

    public void setSabanas(int sabanas) {
        this.sabanas = sabanas;
    }
    public int getMuebles() {
        return muebles;
    }

    public void setMuebles(int muebles) {
        this.muebles = muebles;
    }

    public void reservar() {
        disponible = false;
    }

    public void liberar() {
        disponible = true;
    }
     
}
