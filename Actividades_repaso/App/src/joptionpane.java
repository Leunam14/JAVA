import javax.swing.*;
import java.lang.*;

public class joptionpane {
    
    public static void main(String[] args) {
        
    String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

    String edad = JOptionPane.showInputDialog("Introduce tu edad");

    int edad_usuario = Integer.parseInt(edad);

    System.out.println("Te llamas " + nombre + " y el año que viene tendrás " + (edad_usuario +1) + " años");
    }
}
