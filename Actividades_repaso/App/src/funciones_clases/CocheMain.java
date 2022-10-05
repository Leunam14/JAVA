package funciones_clases;

public class CocheMain {
    
    public static void main(String[] args) {
        
    //Crear objetos
    String coche = "ford";
    
    Coche cocheobj = new Coche();
    
    Coche cocheObj2 = new Coche("Rojo", "Ford", "Focus", 250.0, 125.0);

    cocheObj2.acelerar(50);
    
    System.out.println(cocheObj2);
    
    }

}
