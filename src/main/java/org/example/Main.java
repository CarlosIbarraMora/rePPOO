package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner infoUsu = new Scanner(System.in);
        System.out.println("Bienvennido de nuevo :)");

        cuentaBancaria[] cuentas = new cuentaBancaria[3];
        int idcuenta = 0;

        do {
            System.out.println("Seleccione la acción que quiere realizar: ");
            System.out.println("1.- Crear una cuenta.");
            System.out.println("2.- Despositar.");
            System.out.println("3.- Retirar.");
            System.out.println("4.- Estraer saldo de 8%.");
            System.out.println("5.- Conocer saldo.");
            System.out.println("6.- Salir");
            int busCuenta;

            if (infoUsu.hasNextInt()) {
                int opcionUsu = infoUsu.nextInt();
                infoUsu.nextLine();

                switch (opcionUsu) {
                    case 1:
                        if(idcuenta < cuentas.length) {
                            System.out.println("Ingrese su nombre: ");
                            String nombreUsu = infoUsu.nextLine();
                            System.out.println("Ingrese el saldo con el que desea abrir su cuenta: ");
                            double saldoUsu = infoUsu.nextDouble();

                            cuentas[idcuenta] = new cuentaBancaria(nombreUsu, saldoUsu);
                            idcuenta++;
                            System.out.println("Cuenta creada con éxito, bienvenido " + nombreUsu);
                        }
                        else{
                            System.out.println("Los sentimos pero nuestro sistema está lleno, vuelva a intentarlo en otra ocasión.");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el número de la cuenta a la que desea depositar: ");
                        busCuenta = infoUsu.nextInt() - 1;
                        System.out.println("Ingrese La cantidad de dinero que desea depositar: ");
                        double cantDepositada = infoUsu.nextDouble();
                        cuentas[busCuenta].Depositar(cantDepositada);
                        break;
                    case 3:
                        System.out.println("Ingrese el número de la cuenta a la que desea retirar: ");
                        busCuenta = infoUsu.nextInt() - 1 ;
                        System.out.println("Ingrese La cantidad de dinero que desea retirar: ");
                        double cantRetirar = infoUsu.nextDouble();
                        cuentas[busCuenta].Retirar(cantRetirar);
                        break;
                    case 4:
                        System.out.println("Ingrese el número de la cuenta a la que desea extraer la tasa del 8%: ");
                        busCuenta = infoUsu.nextInt() - 1;
                        cuentas[busCuenta].ExtrTasa();
                        break;
                    case 5:
                        System.out.println("Ingrese el número de la cuenta de la que desea conocer el saldo: ");
                        busCuenta = infoUsu.nextInt() - 1;
                        System.out.println("Su saldo es de: " + cuentas[busCuenta].getSaldo());
                        break;
                    case 6 :
                        System.out.println("Adiós :)");
                        return;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                        break;
                }
            } else {
                System.out.println("Opción no válida, intente de nuevo.");
                infoUsu.nextLine();
            }
        } while (true);
    }
    }
