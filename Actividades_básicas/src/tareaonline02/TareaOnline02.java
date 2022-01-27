/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaonline02;

import java.util.*;

public class TareaOnline02 {

 
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner (System.in);
        int opcion;
        System.out.println("\n1. Actividad1 \n2. Actividad2 \n3. Actividad3 \n4. Actividad4 \n5. Actividad5 \n6. Actividad6 \n7. Actividad7 \n8. Actividad8 \n9. Actividad9 \n10. Actividad10 \n0. Salir del programa");
        System.out.print("Introduzca una opción válida: ");
        do{
            // Mostrar las opciones - texto mostrar por pantalla
            opcion = teclado.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("Saliendo....");
                    break;
                case 1:
                    Actividad1();
                    break;
                
                case 2:
                    Actividad2();
                    break;
                    
                case 3:
                    Actividad3();
                    break;
                
                case 4:
                    Actividad4();
                    break;
                
                case 5:
                    Actividad5();
                    break;
                
                case 6:
                    Actividad6();
                    break;
                    
                case 7:
                    Actividad7();
                    break;
                 
                case 8:
                    Actividad8();
                    break;
                    
                case 9:
                    Actividad9();
                    break;
                    
                case 10:
                    Actividad10();
                    break;
                    
                default:
                    System.err.println("Error. La opcion introducida no es valida.");
                    break;
            }
        }while(opcion != 0);
        
        
    }
    public static void Actividad1(){
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Decir si el número es positivo o negativo");
        System.out.println("Introduce un número ");
        int num=entrada.nextInt(); /*Al poner next.Int nos permitirá introducir números enteros
        que es lo que nos hará falta para este ejercicio*/
        
        if(num<0)
        System.out.println("El número " + num + " es negativo");
        else
        // El 0 es positivo
        System.out.println("El número " + num + " es positivo");
    }
    
    public static void Actividad2(){
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Decir si el número es positivo o negativo, y decir si es cero");
        System.out.println("Introduce un número");
        int num=entrada.nextInt();
        
        if( num <0 ){
            System.out.println("El número " + num + " es negativo");
        }
        
        else if (num >0) {
            System.out.println("El número " + num + " es positivo");
        }
        
        else {
            System.out.println("El número es cero");
        }
    
    }
    
    public static void Actividad3(){
        
        Scanner entrada=new Scanner(System.in);
        
	    
	    System.out.println("Decir que número es mayor");
            System.out.println("Escribe un número ");
	    int num1=entrada.nextInt();
	    
            System.out.println("Escribe un segundo número ");
	    int num2=entrada.nextInt();
	    
            if(num1==num2){
	      System.out.print(" son numeros iguales");
            }
            
            else if(num1>num2) {
	        System.out.print("el numero mayor es  "+num1);
            }
            
            else   {
	        System.out.print("el numero mayor es  "+num2);
                
        }
    
    }
    
    public static void Actividad4() {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un número y dice si son iguales/mayor/menor");
        System.out.println("Escribe un número ");
	    int num1=entrada.nextInt();
	    
            System.out.println("Escribe un segundo número ");
	    int num2=entrada.nextInt();
            
            int resultado;
            
        if(num1==num2){
	      System.out.print(resultado=num1*num2);
            }
            
            else if(num1>num2) {
	        System.out.print(resultado=num1-num2);
            }
            
            else   {
	        System.out.print(resultado=num1+num2);
        }
    /*He cogido la estructura del anterior ejercicio porque en resumidas
        cuentas tenía que hacer lo mismo. Únicamente he aplicado una nueva
        variable llamada resultado donde recogerá el resultado de los 
        cálculos y listo. Tb tenía pensado usar un switch en vez del if,
        pero como iba a dar lo mismo preferí usar la estructura anterior.*/
    }
    
    public static void Actividad5() {
      System.out.println("Suma de números hasta 31");
      for (int num=0; num<31; num++) {
        System.out.println(num);
    } 
    /*La variable num se inicia y declara como 0, entonces he puesto que 
    num<31 para que vaya sumando mediante num++ hasta que llegue al valor 
    de 30. Una vez llegue a 30 parará el bucle.*/
    }
    
    public static void Actividad6 () {
        
        System.out.println("Numero empieza en 50 y termina en 98. Muestra num pares");
        for (int num=50; num<98; num+=2) {
        System.out.println(num);
    } 
     
    /*Es igual que el ejercicio anterior, pero num empieza por 50 y termina
     en 98 (y así mostrará hasta el 97) y le he puesto un incremento de 2
     para que muestre de esta forma los números pares*/
    }
    
    public static void Actividad7 () {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Tabla de multiplicar");
        System.out.println("Introduce un número ");
        int num=entrada.nextInt();
        System.out.println("La tabla de multiplicar del " + num);
        
        for (int n=1; n<11; n++) {
        System.out.println("Multiplica " + num + " x " + n + " = " + num*n);
    }
    /*Como en los anteriores ejercicios he usado la clase Scanner para
        poder introducir valores. Entonces he seguido los ejemplos anteriores
        usando el for para que empiece desde 1 y se vaya incrementando en 1
        el bucle hasta llegar a 10. He terminado poniendo una salida con System
        que enseñe la multiplación usando las variables num (recoge el digito
        a multiplicar) y n (que se incrementará en uno hasta llegar a 10 y 
        de esta manera haga la multiplicación).*/
    }
    
    public static void Actividad8 () {
        
        Scanner entrada=new Scanner(System.in);
        
        String respuesta;
      
        System.out.println("Tabla de multiplicar con repetición");
        do {
        
             System.out.println("Introduce un número ");
        int num=entrada.nextInt();
        System.out.println("La tabla de multiplicar del " + num);
        
        for (int n=1; n<11; n++) {
        System.out.println("Multiplica " + num + " x " + n + " = " + num*n); 

        }
        System.out.println("Desea continuar?:");
        respuesta = entrada.next();

        }while(respuesta.equals("s"));
        /*He usado el bucle do...While para que mientras por teclado escriban
        una "s", el bucle seguirá ejecutándose, ya que la respuesta sea igual 
        a S lo seguirá haciendo. He creado un valor de tipo String para que
        se recoja ahí la respuesta que se formulará más adelante y dará comienzo
        al bucle.
        Al principio quería hacerlo mediante == pero no me salía, así que
        buscando por internet aconsejaban usar equals para realizar 
        la comparativa ya que nos devuelve un valor true o false dependiendo
        de la condición, entonces mientras "respuesta" sea igual al valor que
        se mete dentro del paréntesis, que en este caso es "s",  hará que
        se reinicie el bucle.
        Para terminar tb podríamos añadir "IgnoreCase" para que aunque pongan la
        "S" en mayúscula funcione igualmente, al fin y al cabo la "s" y "S" 
        es lo mismo, pero como el ejercicio solo pide "s" minúscula, lo he 
        dejado tal cual.*/ 
    }
    
    public static void Actividad9() {
        
         Scanner entrada=new Scanner(System.in);
        System.out.println("Calcula el resto");
        System.out.println("Introduce un número ");
        int num=entrada.nextInt();
        
        if (num>0){
            
            System.out.println("El número " + num + " es positivo");
            for (int a=1; a<=num; a++){
                if(num%a==0){
                    System.out.println(a);
                }
            }
            /*He cogido la estructura de los anteriores ejercicios para ahorrar
            tiempo, he añadido un bucle for dentro del if, y al mismo tiempo he 
            metido otro if, donde el cual va a dividir "num" entre "a" hasta
            que el resto sea igual a cero.
            De esta forma imprimirá en pantalla todos los números que contengan
            el resto cero, y así se conseguirán los divisibles.
            El for es crucial en este programa porque es lo que va a conseguir
            que vaya concatenando las sumas de "a" hasta que "a<=num". */
        }
        
        else if (num<0){
            
            System.out.println("El número " + num + " es negativo");
            }
        }
    
    public static void Actividad10() {
        
        int dato=0;
                
		Scanner sc= new Scanner(System.in);
		System.out.println("Calculadora");
		do {


                    System.out.println("\n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Resto \n0. Salir del programa");
                    System.out.print("Introduzca una opción válida: ");
			
			/*He usado los comandos \n como explicaba en el vídeo
                        para evitar poner varias líneas de System.out.println
                        y que se quede el código más limpio.*/
			
			/*Ha convertido la variable dato de tipo entero a 
                        una de tipo integer mediante parseInt, que se registrará
                        en la clase Scanner.*/
			dato=Integer.parseInt(sc.nextLine());
			
			/*Usamos condicional if para explicar que hay que introducir
                        un número entre el rango del 0 al 5 para que el programa
                        funcione.*/
                    if (dato<0 || dato>5) {
				System.out.println("Escoge otra opción");
			/*Si el número que ponemos es distinto que cero
                                seguirá con el condicional y nos pedirá un primer
                                y segundo número para realizar la operación.*/
			} else if (dato!=0) {

				System.out.println("\n");
				
				float operando1, operando2;
				
				System.out.print("Introduce el primer número: ");
				operando1=Float.parseFloat(sc.nextLine());
				
				System.out.print("Introduce el segundo número: ");
				operando2=Float.parseFloat(sc.nextLine());

				
				System.out.println("\n");
				
                                /*Se usará un switch para poner todos los casos
                                que puede optar esta calculadora tal y como se 
                                ha puesto al prinicipio, por lo que cada case
                                representará una función y terminará con un break
                                que dará paso a la finalización del programa y
                                reiniciará el bucle. Una vez que elijamos por 
                                ejemplo case 3, el programa omitirá el resto de
                                case, saliendo del bucle y reiniciándolo.*/
                                
                                switch(dato) {
				
				case 1:
					System.out.println("El resultado de la suma es " + (operando1 + operando2));
					break;
				
                                case 2:
					System.out.println("El resultado de la resta es " + (operando1 - operando2));
					break;
				
                                case 3:
					System.out.println("El resultado de la multiplicación es " + (operando1 * operando2));
					break;
				
                                case 4:
					System.out.println("El resultado de la división es " + (operando1 / operando2));
					break;
				
                                case 5:
					System.out.println("El resto de dividir " +operando1 + " entre " + operando2 + " es "+ (operando1 % operando2));
					break;
					
				}
			}
			
		} while (dato!=0); 
                
                /*Mientras que la variable dato sea diferente de cero
                el programa seguirá ejecutándose. Cuando pulsemos la tecla cero
                imprimirá en pantalla "Cierre de calculadora.*/
		
		sc.close();
		
		System.out.println("Cierre de calculadora.");

	}

}

/*Probé a hacerlo de esta otra forma sin bucles, es más sencilla de entender
pero una vez terminada la operación obviamente se cierra el programa.

Scanner sc= new Scanner(System.in);
        
        System.out.println("\n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Resto \n0. Salir del programa");
        System.out.print("Introduzca una opción válida: ");
                    
        int dato=Integer.parseInt(sc.nextLine()); 
        
        float operando1, operando2;
        
        switch(dato) {
				
				case 1:
                                        System.out.print("Introduce el primer número: ");
                                        operando1=Float.parseFloat(sc.nextLine());
				
                                        System.out.print("Introduce el segundo número: ");
                                        operando2=Float.parseFloat(sc.nextLine());
					System.out.println("El resultado de la suma es " + (operando1 + operando2));
					break;
				
                                case 2:
                                        System.out.print("Introduce el primer número: ");
                                        operando1=Float.parseFloat(sc.nextLine());
				
                                        System.out.print("Introduce el segundo número: ");
                                        operando2=Float.parseFloat(sc.nextLine());
					System.out.println("El resultado de la resta es " + (operando1 - operando2));
					break;
				
                                case 3:
                                        System.out.print("Introduce el primer número: ");
                                        operando1=Float.parseFloat(sc.nextLine());
				
                                        System.out.print("Introduce el segundo número: ");
                                        operando2=Float.parseFloat(sc.nextLine());
					System.out.println("El resultado de la multiplicación es " + (operando1 * operando2));
					break;
				
                                case 4:
					System.out.print("Introduce el primer número: ");
                                        operando1=Float.parseFloat(sc.nextLine());
				
                                        System.out.print("Introduce el segundo número: ");
                                        operando2=Float.parseFloat(sc.nextLine());
                                        System.out.println("El resultado de la división es " + (operando1 / operando2));
					break;
				
                                case 5:
					System.out.print("Introduce el primer número: ");
                                        operando1=Float.parseFloat(sc.nextLine());
				
                                        System.out.print("Introduce el segundo número: ");
                                        operando2=Float.parseFloat(sc.nextLine());
                                        System.out.println("El resto de dividir " +operando1 + " entre " + operando2 + " es "+ (operando1 % operando2));
					break;
                                
                                default:
                                    System.out.println("La opción no es correcta");
                        }*/
    
    
    
    
    
    



