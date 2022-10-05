import java.util.*;

public class condicionales {
    
    public static void main(String[] args) {

        calcularEdad(28);
        
    }

    private static void calcularEdad(int entrada){

        System.out.println("Introduce tu edad: ");

        //Scanner entrada = new Scanner(System.in);

            int edad = entrada;

            if(edad < 18){
                System.out.println("Eres joven");
            }else if(edad >= 18 || edad <=36){
                System.out.println("Eres adulto");
    
            }else if(edad >=37 || edad <=60){
                System.out.println("Estás maduro como una manzana");
            }else if(edad > 61){
                System.out.println("A cuidarse!!!");
            }

    }

    /* private static void calcularEdad(){

        System.out.println("Introduce tu edad: ");

        Scanner entrada = new Scanner(System.in);

            int edad = entrada.nextInt();

            if(edad < 18){
                System.out.println("Eres joven");
            }else if(edad >= 18 || edad <=36){
                System.out.println("Eres adulto");
    
            }else if(edad >=37 || edad <=60){
                System.out.println("Estás maduro como una manzana");
            }else if(edad > 61){
                System.out.println("A cuidarse!!!");
            }

    } */
}
