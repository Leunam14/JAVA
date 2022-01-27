package Principal;

import static Utilidades.ES.leerCaracter;
import static Utilidades.ES.leerEntero;

/**
 * Clase que se va a encargar del funcionamiento completo del juego conecta 4.
 * @author José Manuel Martínez Romera
 * @version 15/12/2020
 */
public class CPrincipal {

    private static final String AMARILLO = "\033[33m";
    private static final String BLANCO = "\033[37m";
    private static final String ROJO = "\033[31m";
    private static final String RESET = "\033[0m"; //Elimina modificador color texto
    private static final int FILAS = 6;
    private static final int COLUMNAS = 7;

    private static int[][] tablero;
    private static boolean unJugador;
    private static String punto = "●"; //Punto que va a colorear dependiendo de quien juegue

    public static void main(String[] args) {

        tablero = new int[FILAS][COLUMNAS]; //Tablero instaciado

        char opcion;

        String mensaje = "Menú del programa"
                + "-----\n"
                + "a. Un jugador\n"
                + "b. Dos jugadores.\n"
                + "c. Salir del juego.\n"
                + "Elija una opción:";

        do {

            opcion = leerCaracter(mensaje);

            switch (opcion) {
                case 'A':
                case 'a':
                    System.out.println("Opción A");
                    resetJuego(1);
                    jugar();
                    break;
                case 'B':
                case 'b':
                    System.out.println("Opción B");
                    resetJuego(2);
                    jugar();
                    break;
                case 'C':
                case 'c':
                    System.out.println("Fin del juego");
                    break;
                default:
                    System.err.println("Error. La opción introducida no es válida.");
            }
        } while (opcion != 'c' && opcion != 'C');

    }

    /**
     * Método que se va a encargar de resetear el tablero y dejarlo a cero.
     * @param numJugadores Número de jugadores donde 1 seremos nosotros, y 2 que
     * corresponderá a la CPU o J2.
     */
    private static void resetJuego(int numJugadores) {

        tablero = new int[FILAS][COLUMNAS]; //Reseteamos el tablero

        if (numJugadores == 1) {
            unJugador = true;
        } else {
            unJugador = false;
        }
    }

    /**
     * Método que se va a encargar de dibujar un tablero con 6 filas y 7
     * columnas y que va a pintar fichas rojas, amarillas o blancas (vacías).
     */
    private static void dibujarTablero() {

        for (int i = 0; i < COLUMNAS; i++) { //Este for dibujará la cabecera del tablero
            System.out.print("  " + i + " ");
        }

        System.out.println();

        for (int i = 0; i < FILAS; i++) {  //Este for va a crear las filas.
            for (int j = 0; j < COLUMNAS; j++) { //Este for va a crear las columnas
                if (tablero[i][j] == 1) {
                    System.out.print("| " + ROJO + punto + RESET + " ");
                } else if (tablero[i][j] == 2) {
                    System.out.print("| " + AMARILLO + punto + RESET + " ");
                } else {
                    System.out.print("| " + BLANCO + punto + RESET + " ");
                }

                if (j == COLUMNAS - 1) { //Para cuando llegue al final de la fila imprimirá | que es el margen derecho del tablero
                    System.out.print("|");
                }
            }
            System.out.println();
        }

    }

    /**
     * Método que se va a encargar de colocar ficha en el tablero.
     *
     * @param numJugador J1, J2 o CPU que va a colocar ficha
     * @param numColumna La columna en la cual se va a colocar la ficha
     * @return verdadero si ha encontrado un hueco libre o false si no ha
     * encontrado sitios libre.
     */
    private static boolean colocarFicha(int numJugador, int numColumna) {
        /*Se usa un bucle for con decremento para poder chequear el tablero de abajo a arriba,
        ya que las piezas se ponen primero en la parte de abajo.*/
        for (int i = FILAS - 1; i >= 0; i--) {
            if (tablero[i][numColumna] == 0) { //tablero simboliza que está vacía, y si lo está se pone la de J1.
                tablero[i][numColumna] = numJugador;
                return true;
                //Si llega hasta aquí es que ha encontrado un espacio libre
            }
        }

        return false;
    }

    /**
     * Método que se va a encargar de soltar la ficha en el tablero, dependiendo
     * de sí es J1, J2 o CPU.
     *
     * @param numJugador Quien va a soltar ficha en el tablero
     */
    private static void soltarFicha(int numJugador) {

        int numColumna;
        boolean columnaValida = false; //Si es false repetirá el bucle hasta que sea true

        if (numJugador == 1) {
            do {
                System.out.println("JUGADOR 1\n Introduce el número de columna:");
                numColumna = leerEntero();

                if (numColumna < 0 || numColumna > 6) {
                    System.out.println("Número de columna erróneo.");
                } else {
                    columnaValida = colocarFicha(numJugador, numColumna);

                    if (columnaValida == false) {
                        System.out.println("La columna está llena.");
                    } else {
                        System.out.println("Ficha colocada perfectamente");
                        dibujarTablero();
                    }

                }
            } while (numColumna < 0 || numColumna > 6 || columnaValida == false);

        }

        if (numJugador == 2) {

            if (unJugador) { //Si esta variable es true, estamos jugando contra la CPU

                //Generar aleatoriamente un número entre 0 y 6
                //Math.random()*M-N+1)+N --> M = Mayor, N = Menor
                do {
                    int numColumnaAletorio = (int) (Math.random() * 7);

                    columnaValida = colocarFicha(numJugador, numColumnaAletorio);

                    if (columnaValida) {
                        dibujarTablero();
                    }

                } while (!columnaValida);

            } else {

                do {
                    System.out.println("JUGADOR 2\n Introduce el número de columna: ");
                    numColumna = leerEntero();
                    //Con este if nos encargamos de que se introduzca un número de columna correcto.
                    if (numColumna < 0 || numColumna > 6) {
                        System.out.println("Número de columna erróneo.");
                    } else {
                        columnaValida = colocarFicha(numJugador, numColumna);

                        if (columnaValida == false) {
                            System.out.println("La columna está llena.");
                        } else {
                            System.out.println("Ficha colocada perfectamente");
                            dibujarTablero();
                        }
                    }
                } while (numColumna < 0 || numColumna > 6 || columnaValida == false);

            }

        }

    }

    /**
     * Método que se va a encargar de comprobar si hay un ganador, el cual hará
     * un chequeo de las filas y columas para encontrar 4 fichas de un mismo
     * color de forma horizontal y vertical.
     * @param numJugador el jugador que se chequea si es ganador
     * @return Devuelve el jugador ganador
     */
    
    private static int comprobarGanador(int numJugador) {

        //Este for comprueba las filas de la tabla
        for (int i = 0; i < FILAS; i++) {

            //For que recorre cada fila de izquierda a derecha y comprueba las líneas de 4 en 4
            for (int j = 0; j < 4; j++) {

                if (tablero[i][j] == numJugador
                        && tablero[i][j + 1] == numJugador
                        && tablero[i][j + 2] == numJugador
                        && tablero[i][j + 3] == numJugador) {
                    return numJugador;
                }
            }
        }

        //Este for comprueba las columnas de la tabla
        for (int i = 0; i < COLUMNAS; i++) {

            //For que recorre cada columna de arriba hacia abajo
            for (int j = 0; j < 3; j++) {

                if (tablero[j][i] == numJugador
                        && tablero[j + 1][i] == numJugador
                        && tablero[j + 2][i] == numJugador
                        && tablero[j + 3][i] == numJugador) {
                    return numJugador;
                }
            }
        }

        return -1; //Devolvemos -1 para indicar que no se devuelve ningún valor dentro del rango establecido en número de Jugadores.
    }

    /**
     * Método que se va a encargar del funcionamiento del programa y llamará al
     * resto de métodos Describe el procedimiento a seguir para el
     * funcionamiento correcto de todos los métodos creados, encargándose de
     * decir si ha habido un ganador , quien ha sido y si ha habido un empate.
     */
    private static void jugar() {

        //Esta variable nos indicará si existe un ganador. Si no existe, su valor es -1.
        int ganador = -1;

        //Primero dibujamos el tablero
        dibujarTablero();

        do {

            //Después comprobamos que existe espacio disponible
            if (comprobarEspacioVacio()) {

                //Pedimos el turno para el jugador 1
                soltarFicha(1);

                //Comprobamos si el jugador 1 ha ganado
                ganador = comprobarGanador(1);

                if (ganador == -1) {

                    //Comprobamos de nuevo si existe espacio en el tablero
                    if (comprobarEspacioVacio()) {

                        //Pedimos el turno para el jugador 2
                        soltarFicha(2);

                        //Comprobamos si el jugador 2 ha ganado
                        ganador = comprobarGanador(2);

                    }

                }

            }

        } while (ganador == -1 && comprobarEspacioVacio());

        //Mostramos por pantalla el resultado de la partida
        if (ganador == 1) {
            System.out.println("HA GANADO EL JUGADOR 1!!!");
        } else if (ganador == 2) {
            System.out.println("HA GANADO EL JUGADOR 2!!!");
        } else {
            System.out.println("HA HABIDO UN EMPATE!!!");
        }

    }

    /**
     * Método de tipo boolean que se va a encargar de comprobar el espacio vacío
     * en el tablero
     * @return true si encuentra un espacio vacío y false si no lo hay.
     */
    private static boolean comprobarEspacioVacio() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

}