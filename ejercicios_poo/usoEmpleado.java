

import java.time.LocalDate;

public class usoEmpleado{


    public static void main(String[] args) {

    jefatura departamentoRRHH = new jefatura("Mikaela", 2100, 2017, 9, 21);

    departamentoRRHH.estableceIncentivo(150);
        
    empleado[] misEmpleados = new empleado[5];

    misEmpleados[0] = new empleado("Leunam", 1500, 2021, 6, 14);
    misEmpleados[1] = new empleado("Cintia", 1800, 2022, 2, 7);
    misEmpleados[2] = new empleado("Javier", 2100, 2018, 9, 28);
    misEmpleados[3] = departamentoRRHH; // Polimorfismo
    misEmpleados[4] = new jefatura("Laura", 1900, 2018, 4, 5);

    jefatura departamentoEconomia = (jefatura) misEmpleados[4]; /*Como no puedo usar los métodos de la clase jefatura, ya que es un objeto
    de tipo empleado, llevamos a cabo un casting, poniendo el nombre de la clase, luego el nombre de la variable, igual a la clase y el 
    la posición del array que queremos convertir.
    
    En este caso, llamamos a la variable, junto al método que proviene gracias a la herencia de la clase jefatura, y establecemos el valor del método.
    
    Si quisiéramos hacer lo mismo con una posición del array de un objeto de tipo empleado, dará error de compilación.*/

    departamentoEconomia.estableceIncentivo(530);
    

    for(int i = 0; i < misEmpleados.length; i++){
        misEmpleados[i].subeSueldo(10);
    }

    for(int i = 0; i < misEmpleados.length; i ++){
        System.out.println(misEmpleados[i].dameNombre()  + ". El salario es de " + misEmpleados[i].dameSueldo() + "€. " + misEmpleados[i].dameFecha());
    }


    /* empleado nuevoEmpleado = new empleado("Leunam", 1500, 2021, 05, 21);

    //nuevoEmpleado.devuelveNombre(JOptionPane.showInputDialog("Escribe tu nombre"));
    nuevoEmpleado.subeSueldo(15);

    System.out.println(nuevoEmpleado.dameNombre() + ". El sueldo es de " + nuevoEmpleado.dameSueldo() + ". La fecha de contratación es " + nuevoEmpleado.dameFecha());
       */  
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

class jefatura extends empleado {


    public jefatura (String nombre, int sueldo, int anio, int mes, int dia){

        super(nombre, sueldo, anio, mes, dia);
    }

    private double incentivo;

    public void estableceIncentivo(double nuevoIncentivo){

        incentivo = nuevoIncentivo;
    }

    public double dameSueldoJefe(){

        double sueldoJefe = super.dameSueldo(); //En el caso de haber dos métodos con mismo nombre, se aplica el super antes del método para decir que se está usando el método heredado.

        return sueldoJefe + incentivo;
    }
}

final class director extends jefatura{ //Al poner la clase director como final, no habrá más clases que puedan heredar de ella

    public director(String nombre, int sueldo, int anio, int mes, int dia){

        super(nombre, sueldo, anio, mes, dia);
    }

}