

import javax.swing.*;

public class coche {

    private int ruedas, largo, ancho, motor, peso_plataforma;

    private static int peso_total;

    private String color;

    private boolean asientos_cuero, climatizador;



    public coche (){

        ruedas = 4;

        largo = 200;

        ancho = 3000;

        motor = 1000;

        peso_total = 500;

        peso_plataforma = 100;
    }

    public String devuelveDatos(){ //Getter

        
        return "El largo del coche es " + largo + ", y tiene " + ruedas + " ruedas, un ancho de " + ancho/1000 + "m, un peso de " + peso_total + 
        "kg y un motor de " + motor + " cilindradas";
    }

    public void cambioColor(String color){ //Setter

        this.color = color;
    }

    public String dimeColor(){

        return "Se ha cambiado el color a " + color;
    }

    public void configuraAsientos(String asientos_cuero){ //Setter

        if (asientos_cuero.equalsIgnoreCase("Sí")) {
            
            this.asientos_cuero = true;
           
        } else {
            this.asientos_cuero = false;
            
        }
    }

    public String dimeAsientos(){ //Getter

        if (asientos_cuero == true) {
            
            return "Dispone de asientos de cuero";

        } else {
            return "No dispone de asientos de cuero";
        }
    }

    public void configuraClimatizador (String climatizador){ // Setter

        if (climatizador.equalsIgnoreCase("Sí")) {
            
            this.climatizador = true;

        } else {
            this.climatizador = false;
        }
    }

    public String dimeClimatizador(){ //Getter

        if (climatizador == true) {
            
            return "Dispone de climatizador";
        
        } else {
            return "No dispone de climatizador";    
        }
    }

    public String dimePesoTotal(){ //Setter + Getter

        int peso_carroceria = 600;

        peso_total = peso_carroceria + peso_plataforma;

        if (asientos_cuero == true) {
            
            peso_total = peso_total + 50;
        } 

        if(climatizador == true){
            
            peso_total = peso_total + 20;
        }

        return "El peso total con los dos extras es de " + peso_total;


    }

    public int precioVehiculo (){ //Getter porque no estamos cogiendo una variable de clase y cambiándole el valor

        int precio_total = 12000;

        if(asientos_cuero == true){
            
            precio_total += 1500;
        }

        if(climatizador == true){

            precio_total +=700;
        }

        return precio_total;
    }

    public static void main(String[] args) {
        
        coche Renault = new coche();

        Renault.cambioColor(JOptionPane.showInputDialog("Introduce color: "));

        furgoneta Ford = new furgoneta(500, 2);

        Ford.cambioColor(JOptionPane.showInputDialog("Introduce color de la furgoneta: "));

        Renault.configuraAsientos(JOptionPane.showInputDialog("¿Quieres asientos de cuero? "));

        Renault.configuraClimatizador(JOptionPane.showInputDialog("¿Quieres climatizador? "));

        System.out.println(Renault.devuelveDatos() + "\n" + Renault.dimeColor() +"\n" + Renault.dimeAsientos() + "\n" + Renault.dimeClimatizador()
         + "\n" + Renault.dimePesoTotal() + "\n" + "El precio total del vehículo es " + Renault.precioVehiculo() + 
         "\n Datos furgoneta: " + Ford.datosFurgoneta() + Ford.dimeColor() + ". Tiene un peso total de " + (peso_total+50));
        

    }

}

class furgoneta extends coche{ //Uso de herencia
    
    private int carga_furgoneta;
    private int plazas_extra;

    public furgoneta (int carga_furgoneta, int plazas_extra){

        super(); //Llama al constructor clase padre /(coche)

        this.carga_furgoneta = carga_furgoneta;
        this.plazas_extra = plazas_extra;

    }

    public String datosFurgoneta(){

        return "La capacidad de carga es " + carga_furgoneta + ". Tiene " + plazas_extra + " plazas extra.";

    }


}
