package ejercicios_poo;
import java.util.*;

public class acierta_num_aleatorio {

    private int aleatorio;
    private int contador;
    private int num;
    private Scanner entrada;

    public void inicializar(){

        aleatorio = (int)(Math.random()*100);
        contador = 0;
        System.out.println("Introduce un número: ");


    }

    public void numAleatorio(){

        do {

            entrada = new Scanner(System.in);

            num = entrada.nextInt();

            if (aleatorio > num) {
                
                System.out.println("El número es mayor");
                contador ++;
            } else {
                System.out.println("El número es menor");
                contador ++;
            }
           
        } while (aleatorio != num);

        System.out.println("Correcto. El número es " + aleatorio + ". Has acertado en " + contador + " intentos.");

    }

    public static void main(String[] args) {
        
        acierta_num_aleatorio numero = new acierta_num_aleatorio();
        numero.inicializar();
        numero.numAleatorio();
    }

}
