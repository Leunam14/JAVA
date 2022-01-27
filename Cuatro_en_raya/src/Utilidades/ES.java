package Utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que va a tener los métodos para ES
 * @author José Manuel Martínez Romera
 * Versión 15/12/2020
 */
public class ES {

    /**
     * Metodo que se encarga de realizar la lectura de un numero entero desde
     * teclado usando un try/catch.
     *
     * @return el valor entero leÃ­do desde teclado
     */
    public static int leerEntero() {

        Scanner teclado = new Scanner(System.in);

        do {
            try {
                return teclado.nextInt();

            } catch (InputMismatchException e) {
                System.err.println("Error. No ha introducido un numero entero");
                System.out.print("Introduzca un nuevo numero: ");
                teclado.next();
            }
        } while (true);
    }

    /**
     * Metodo que se encarga de realizar lectura de un nÃºmero
     *
     * @param mensaje Texto que se va a mostrar por pantalla
     * @return valor entero leÃ­do desde teclado
     */
    public static int leerEntero(String mensaje) {

        Scanner teclado = new Scanner(System.in);

        System.out.print(mensaje);

        return teclado.nextInt();
    }

    /**
     * Metodo que se encarga de realizar la escritura
     *
     * @param mensaje texto que se va a mostrar por pantalla
     */
    public static void escribir(String mensaje) {
        System.out.print(mensaje);

    }

    /**
     * Método que se va a encargar de devolver un caracter
     *
     * @param mensaje texto que se va a mostrar por pantalla
     * @return Devuelve por teclado un caracter
     */
    public static char leerCaracter(String mensaje) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(mensaje);

        return teclado.nextLine().charAt(0);

    }

    /**
     * Metodo que se encarga de realizar lectura de dos números en un rango min-max.
     * @param num1 primer número introducido
     * @param num2 segundo número introducido
     * @return valor entero leÃ­do desde teclado
     */
    
    public static int leerEntero(int num1, int num2) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();

            if (numero < num1 || numero > num2) {
                System.out.println("Número introducido incorrecto.");
            }

        } while (numero < num1 || numero > num2);
        
        return numero;

    }
    
    /**
     * Metodo que se encarga de realizar lectura de dos números en un rango min-max con mensaje.
     * @param num1 primer número introducido
     * @param num2 segundo número introducido
     * @param mensaje texto que se va a mostrar por pantalla
     * @return valor entero leí­do desde teclado
     */
    
    public static int leerEntero(int num1, int num2, String mensaje) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.println(mensaje);
            numero = teclado.nextInt();

            if (numero < num1 || numero > num2) {
                System.out.println("Número introducido incorrecto.");
            }

        } while (numero < num1 || numero > num2);
        
        return numero;

    }
    
    

}
