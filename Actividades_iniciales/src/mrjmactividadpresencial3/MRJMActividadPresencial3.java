/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrjmactividadpresencial3;

import java.util.*;

/**
 *
 * @author chema
 */
public class MRJMActividadPresencial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("\n1. Actividad1 \n2. Actividad2 \n3. Actividad3 \n4. Actividad4 \n0. Salir del programa");
        System.out.print("Introduzca una opción válida: ");
        do {
            // Mostrar las opciones - texto mostrar por pantalla
            opcion = teclado.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Cerrando programa.");
                    break;
                case 1:
                    Actividad1();
                    break;

                case 2:
                    Actividad2();
                    break;

                case 3:
                    Actividad3();
                    break;

                case 4:
                    Actividad4();
                    break;
            }
        } while (opcion != 0);

    }

    public static void Actividad1() {

        /*Scanner entrada = new Scanner(System.in);

        System.out.println("Tabla de multiplicar");
        int num = 0;
        boolean numeroCorrecto = false;
        do {
            try {
                System.out.print("Introduce un número: ");
                num = entrada.nextInt();
                numeroCorrecto = true;
                if (num < 1 || num > 10) {
                    System.out.println("Introduce un valor comprendido entre 1 y 10.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error, no ha introducido un número");
                entrada.next();
            }
        } while (!numeroCorrecto & num < 1 || num > 10);

        System.out.println("La tabla de multiplicar del " + num);

        for (int n = 1; n < 11; n++) {
            System.out.println("Multiplica " + num + " x " + n + " = " + num * n);
        }*/
        int num;
        System.out.print("Introduce un número: ");
        num = ES.leerEntero();
    }

    @SuppressWarnings("empty-statement")
    public static void Actividad2() {

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Calcular la media de 3 números");
        int repeticiones = 3;
        float numero = 0, suma = 0;
        boolean numeroCorrecto = false;
        do {
            try {

                for (int i = 0; i < repeticiones; i++) {
                    System.out.print("Introduzca un número: ");

                    numero = teclado.nextInt();

                    System.out.println("Número leído.");

                    suma += numero;

                    numeroCorrecto = true;
                }
            } catch (InputMismatchException e) {
                System.err.println("Error, no ha introducido un número");
                teclado.next();

            }

        } while (numeroCorrecto = false);
        System.out.println("La media de los 3 números es: " + suma / 3);*/
        int repeticiones;
        System.out.print("Introduce un número: ");
        String mensaje = " La media de los 3 números";
        repeticiones = ES.leerEntero(mensaje);
    }

    public static void Actividad3() {

        /*Scanner teclado = new Scanner(System.in);

        int num1, num2 = 0;

        num1 = (int) (Math.random() * 100);

        System.out.println("Adivine un número aleatorio entre 0 y 100.");
        boolean numeroCorrecto = false;

        do {
            try {
                System.out.print("Introduce un número: ");
                num2 = teclado.nextInt();

                if (num2 > num1) {

                    System.out.println("El número es más pequeño.");

                } else if (num2 < num1) {

                    System.out.println("El número es más grande.");
                    numeroCorrecto = true;
                }
            } catch (InputMismatchException e) {
                System.err.println("Error, no ha introducido un número");
                teclado.next();

            }

        } while (numeroCorrecto == false || num2 != num1);

        System.out.println("Correcto.");*/
        int num1 = 0;
        System.out.println("Adivine un número aleatorio entre 0 y 100.");
        int num2 = 100;
        num1 = ES.leerEntero(num1, num2);
    }

    public static void Actividad4() {

        /*Scanner teclado = new Scanner(System.in);
        boolean numeroCorrecto = false;
        int base = 0, altura = 0;
        System.out.println("Dibujando un rectángulo.");

        do {
            try {
                System.out.print("Introduzca el valor de la base: ");
                base = teclado.nextInt();
                numeroCorrecto = true;
                if (base <= 0) {
                    System.err.println("Error. La base tiene que ser mayor que 0");

                }

            } catch (InputMismatchException e) {
                System.err.println("Error, no ha introducido un número");
                teclado.next();

            }
        } while (numeroCorrecto == false || base <= 0);

        do {
            try {

                System.out.print("Introduzca el valor de la altura: ");
                altura = teclado.nextInt();
                numeroCorrecto = true;
                if (altura <= 0) {
                    System.err.println("Error. La altura tiene que ser mayor que 0");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error, no ha introducido un número");
                teclado.next();

            }
        } while (numeroCorrecto == false || altura <= 0);

        System.out.println("El área del rectángulo es " + base * altura);*/
        int base = 0;
        int altura = 0;
        System.out.println("Dibujando un rectángulo.");
        String mensaje = null;
        int resultado = ES.leerEntero(mensaje, altura, base);
    }
}
