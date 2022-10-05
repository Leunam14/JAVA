package funciones_clases;

public class CocheMain {
    
    public static void main(String[] args) {
        
        //Crear objetos
        String coche = "ford";
        
        Coche cocheobj = new Coche();
        
        Coche cocheObj2 = new Coche("Rojo", "Ford", "Focus", 250.0, 125.0);

        cocheObj2.acelerar(50); //Accedemos al método del objeto

        cocheObj2.peso = 150.1; //Para acceder a los objetos es así
        
        System.out.println(cocheObj2);

        CocheElectrico cocheElecObj = new CocheElectrico();

        cocheElecObj.motorElectrico = "Sí";
        cocheElecObj.color = "verde";
        cocheElecObj.largo = 125.0;

        System.out.println(cocheElecObj);

        

        CocheElectrico cocheElecObj2 = new CocheElectrico("magenta", "Renault", "Clio", 350.4, 230.4, "TX2");

        System.out.println(cocheElecObj2);

    }

}
