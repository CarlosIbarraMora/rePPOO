package org.example;

public class Automovil {
    public int velocidadMax;
    public int kmPorLitro;
    public int capTanque;
    public int velActual;
    public int cantCombustible;
    public boolean encendido;
    public Automovil(int velocidadMax, int kmPorLitro, int capTanque, int velActual, int cantCombustible, boolean encendido) {
        this.velocidadMax = velocidadMax;
        this.kmPorLitro = kmPorLitro;
        this.capTanque = capTanque;
        this.velActual = velActual;
        this.cantCombustible = cantCombustible;
        this.encendido = encendido;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public int getKmPorLitro() {
        return kmPorLitro;
    }

    public int getCapTanque() {
        return capTanque;
    }

    public int getVelActual() {
        return velActual;
    }

    public int getCantCombustible() {
        return cantCombustible;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public void setKmPorLitro(int kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }

    public void setCapTanque(int capTanque) {
        this.capTanque = capTanque;
    }

    public void setVelActual(int velActual) {
        this.velActual = velActual;
    }

    public void setCantCombustible(int cantCombustible) {
        this.cantCombustible = cantCombustible;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void Acelerar(){
        velActual++;
    }

    public void encender(){
        encendido = true;
    }
    public void apagar(){
        encendido = false;
    }
    public void adicionarCombustible(int cantidad){
        cantCombustible += cantidad;
    }
    public void setCapacidadTanque (int Cap) {
        capTanque = Cap;
    }

}
