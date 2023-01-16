package org.example.ActividadCuentaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cuenta usuario1 = new Cuenta("Juan", 500);

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Ingresar dinero \n2. Sacar dinero \n3. Ver cantidad \n0. Cerrar");
            System.out.print("Introduzca una opción válida: ");
            // Mostrar las opciones - texto mostrar por pantalla
            opcion = teclado.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Cerrando programa.");
                    break;
                case 1:
                    usuario1.ingresar();
                    break;

                case 2:
                    usuario1.retirar();
                    break;

                case 3:
                    System.out.println(usuario1.verCantidad());
                    break;
            }
        } while (opcion != 0);

    }
}
