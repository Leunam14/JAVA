package mrjmactividadpresencial3;

import java.util.*;

/**
 *
 * @author chema
 */
public class ES {

    public static int leerEntero() {

        Scanner entrada = new Scanner(System.in);

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
        }
        return num;
    }

    public static int leerEntero(String mensaje) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcular la media de 3 números");
        int repeticiones = 3;
        float numero = 0, suma = 0;

        for (int i = 0; i < repeticiones; i++) {
            System.out.print("Introduzca un número: ");

            numero = teclado.nextInt();

            System.out.println("Número leído.");

            suma += numero;

        }

        System.out.println("La media de los 3 números es: " + suma / 3);

        return repeticiones;
    }

    public static int leerEntero(int num1, int num2) {

        Scanner teclado = new Scanner(System.in);

        num1 = (int) (Math.random() * 100);

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

        System.out.println("Correcto.");

        return num1;

    }

    public static int leerEntero(String mensaje, int minimo, int maximo) {

        Scanner teclado = new Scanner(System.in);
        boolean numeroCorrecto = false;
        int base = 0, altura = 0;
        

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
        int resultado = base * altura;
        System.out.println("El área del rectángulo es " + resultado);
        return resultado;
    }
}
