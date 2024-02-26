package org.example;

public class cuentaBancaria {
    private String nombre;
    private double saldo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public cuentaBancaria(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public void Depositar(double cantDepositada){
        saldo += cantDepositada;
        System.out.println("Operación realizada con éxito, su saldo es de: " + saldo);
    }

    public void Retirar(double cantRetirar){
        if(cantRetirar <= saldo){
            saldo -= cantRetirar;
            System.out.println("Operación realizada con éxito, su saldo es de: " + saldo);
        }
        else{
            System.out.println("No cuenta con los fondos suficientes para realizar esta operación.");
        }
    }
    public void ExtrTasa() {
        if (saldo > 0) {
            double tasa = (saldo * 0.08);
            saldo -= tasa;
            System.out.println("Operación realizada con éxito, su saldo es de: " + saldo);
        } else {
            System.out.println("No cuenta con los fondos suficientes para realizar esta operación.");
        }
    }
}
