import java.util.*;

public class scanner {
    
    public static void main(String[] args) {
        
        /*Scanner tiene tres métodos:
         *  NextLine(), nextInt() y nextDouble()
         * Tb está showInputDialog() de la clase JOptionPane para introducir información, pero es estático
         */

        Scanner entrada = new Scanner(System.in); //Creamos el objeto de tipo entrada para recoger los valores de Scanner
    
        System.out.println("Introduce tu nombre");

        String nombre = entrada.nextLine();

        System.out.println("Introduce tu edad");

        int edad = entrada.nextInt();

        System.out.println("Has introducido el nombre: " + nombre + ". Con edad " + edad + " años");

    }
}
