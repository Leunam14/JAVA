package ejercicios_poo;
import java.util.*;

public class uso_poo_basico {
    
    private Scanner teclado; //Declaración de variables
    private String nombre = "Leunam";
    private int edad;

    public void Inicializar(){

        teclado = new Scanner(System.in); //Inicializamos
        System.out.println("Escribe tu nombre:");
        nombre = teclado.next();
        System.out.println("Escribe tu edad:");
        edad = teclado.nextInt();
    }

    public void Imprimir(){ //Imprimimos valores
        System.out.println("Te llamas " + nombre);
        System.out.println("Tienes " + edad + " años.");
    }

    public void Validacion(){ //Validamos la edad con un simple if
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

    public static void main(String[] args) {
        
        uso_poo_basico personal = new uso_poo_basico();  //Instanciamos una clase
        
        personal.Inicializar();
        personal.Imprimir();
        personal.Validacion();
    }

}
