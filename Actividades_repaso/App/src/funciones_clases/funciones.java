package funciones_clases;

public class funciones {
    
    public static void main(String[] args) {
        
        holaMundo();
        holaMundo("Leunam");

        String hola = devolverHola();
        System.out.println(hola);
        int suma = suma(5, 4);
        System.out.println(suma);

    }

    private static void holaMundo(){

        System.out.println("Hola mundo desde un método");
    }

    private static void holaMundo(String nombre){

        System.out.println("Hola " + nombre);
    }

    private static String devolverHola(){
        
        return "Hola";
    }

    private static int suma(int num1, int num2){

        return num1 + num2;
    }

    //Con protected podríamos usar las funciones dentro del mismo paquete, pero no desde otro de fuera
    //Con public se accede desde todos sitios
    //Con private solo es accesible desde dentro de la clase
    //Si no ponemos ninguno de los anteriores, solo sería visible dentro del mismo paquete, como protected

    
}
