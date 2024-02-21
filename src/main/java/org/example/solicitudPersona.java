package org.example;

public class solicitudPersona extends solicitud{
    public String CI;
    public String nombrePersona;
    public solicitudPersona(int ID, String destino, String fechaSalida, boolean primeraClase, int asientos, String CI, String nombrePersona) {
        super(ID, destino, fechaSalida, primeraClase, asientos);
        this.CI = CI;
        this.nombrePersona = nombrePersona;
    }

    public String getCI() {
        return CI;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
}
