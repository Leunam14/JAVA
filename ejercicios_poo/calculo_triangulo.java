package ejercicios_poo;

import java.util.*;

public class calculo_triangulo {
    
    /* Desarrollar un programa que cargue los lados de un triángulo e implemente los siguientes métodos: 
    inicializar los atributos, imprimir el valor del lado mayor y otro método que muestre si es equilátero o no.*/

    private int lado, lado1, lado2;
    private Scanner teclado;

    public void inicializar(){

        teclado = new Scanner(System.in);
        System.out.println("Introduce el primer lado: ");
        lado = teclado.nextInt();

        System.out.println("Introduce el segundo lado: ");
        lado1 = teclado.nextInt();

        System.out.println("Introduce el tercer lado: ");
        lado2 = teclado.nextInt();

    }

    public void ladoMayor(){

        if (lado >= lado1 && lado >= lado2) {
            
            System.out.println("El lado " + lado + " es el mayor de los tres");
        } else if(lado1 >= lado && lado1 >= lado2){
            System.out.println("El lado " + lado1 + " es el mayor de los tres");
        }else{
            System.out.println("El lado " + lado2 + " es el mayor de los tres");

        }

    }

    public void equilatero(){

        if (lado == lado1 && lado == lado2) {
            System.out.println("Es un triángulo equilatero");
        } else {
            System.out.println("No es un triángulo equilatero");
        }
    }

    public static void main(String[] args) {
        
        calculo_triangulo triangulo = new calculo_triangulo();
        triangulo.inicializar();
        triangulo.ladoMayor();
        triangulo.equilatero();
    }
}
