package org.example;

public class solicitud {
    protected int ID;
    protected String destino;
    protected String fechaSalida;
    protected boolean primeraClase;
    protected int asientos;

    public solicitud(int ID, String destino, String fechaSalida, boolean primeraClase, int asientos) {
        this.ID = ID;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.primeraClase = primeraClase;
        this.asientos = asientos;
    }

    public int getID() {
        return ID;
    }

    public String getDestino() {
        return destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public boolean isPrimeraClase() {
        return primeraClase;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setPrimeraClase(boolean primeraClase) {
        this.primeraClase = primeraClase;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
}
