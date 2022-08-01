import java.util.*;

public class acierta_num_aleatorio {
    
    public static void main(String[] args) {
        
        int aleatorio = (int)(Math.random()*100);

        int contador = 0;

        int num;

            do {

                Scanner datos = new Scanner(System.in);

                num = datos.nextInt();

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
}
