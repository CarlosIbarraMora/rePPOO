package org.example;

public class solicitudEmpresa extends solicitud{
    public String nombreEmpresa;
    public boolean empresaNacional;
    public solicitudEmpresa(int ID, String destino, String fechaSalida, boolean primeraClase, int asientos, String nombreEmpresa, boolean empresaNacional) {
        super(ID, destino, fechaSalida, primeraClase, asientos);
        this.empresaNacional = empresaNacional;
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public boolean isEmpresaNacional() {
        return empresaNacional;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setEmpresaNacional(boolean empresaNacional) {
        this.empresaNacional = empresaNacional;
    }
}
