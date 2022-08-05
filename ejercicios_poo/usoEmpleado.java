package poo;

import java.time.LocalDate;

public class usoEmpleado{


//EJERCICIO BASADO EN un TUTORIAL DE PILDORAS INFORMÁTICAS PARA REPASAR

    
    public static void main(String[] args) {

    empleado nuevoEmpleado = new empleado("Leunam", 1500, 2021, 05, 21);

    //nuevoEmpleado.devuelveNombre(JOptionPane.showInputDialog("Escribe tu nombre"));
    nuevoEmpleado.subeSueldo(15);

    System.out.println(nuevoEmpleado.dameNombre() + ". El sueldo es de " + nuevoEmpleado.dameSueldo() + ". La fecha de contratación es " + nuevoEmpleado.dameFecha());
        
    }
    
}

class empleado {

    private String nombre;

    private double sueldo;

    private LocalDate fechaContrato;


    public empleado(String nom, double sue, int anio, int mes, int dia){

        this.nombre = nom;
        this.sueldo = sue;
        this.fechaContrato = LocalDate.of(anio, mes, dia);
          
    }

    public String dameNombre (){ //Getter

        return "El nombre es " + nombre;
    }

    public void devuelveNombre(String nuevoNombre){ //Setter

        this.nombre = nuevoNombre;

    }
    
    public double dameSueldo(){

        return sueldo;
    }

    public void subeSueldo(double aumento){

        double nuevoSueldo = this.sueldo*aumento/100;

        this.sueldo += nuevoSueldo;
    }

    public String dameFecha (){

        return "La fecha de contratación es " + fechaContrato;
    }
}