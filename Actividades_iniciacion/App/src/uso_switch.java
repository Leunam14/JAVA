import java.util.*;
import javax.swing.*;
import java.lang.*;

public class uso_switch {
    
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("1.- Suma \n 2.- Resta \n 3. Multiplicación \n 4. División");    

    int valor = entrada.nextInt();

    switch(valor){

        case 1: 
            float num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer valor"));

            float num2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el segundo valor"));

            System.out.println("La suma de " + num1 + " y " + num2 + " es igual " + (num1 + num2));

        break;

        case 2:
            num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer valor"));

            num2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el segundo valor"));

            System.out.println("La resta de " + num1 + " y " + num2 + " es igual " + (num1 - num2));

        break;

        case 3:

            num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer valor"));

            num2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el segundo valor"));

            System.out.println("La multiplicación de " + num1 + " y " + num2 + " es igual " + (num1 * num2));
        break;

        case 4:

            num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer valor"));

            num2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el segundo valor"));

            System.out.println("La división de " + num1 + " y " + num2 + " es igual " + (num1 / num2));
        break;

        
    }

    } 
}
