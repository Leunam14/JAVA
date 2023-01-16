package org.example.ActividadCuentaBancaria;

import javax.swing.*;

public class Cuenta {

//    Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad
//    (puede tener decimales).
//
//    El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
//
//    Crea sus métodos get, set y toString.
//
//    Tendrá dos métodos especiales:
//


    private String titular;
    private double cantidad;
    private double dinero;

    public Cuenta(String titular, double dinero) {
        this.titular = titular;
        this.dinero = dinero;
    }

    public Cuenta(){}

    public String getTitular() {
        return titular;
    }

    public double getDinero(){
        return dinero;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }


    //    ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida
    //    es negativa, no se hará nada.

    public double ingresar() {

        try {
           double cantidad = Double.valueOf(JOptionPane.showInputDialog("Cantidad a ingresar"));

            double total = getDinero();
            if (cantidad <= 0){
                System.out.println("No se ha ingresado ninguna cantidad");
            }else{
                System.out.println("Se ha introducido " + cantidad + "€ en tu cuenta");
                total = total + cantidad;
                setDinero(total);
            }
        } catch (Exception e) {
            System.err.println("Es un error de tipo " + e.getMessage());
        }
        return getDinero();

    }

    //    retirar(double cantidad): se retira una cantidad a la cuenta, si restando la
    //    cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

    public double retirar() {

            try {
                Double cantidad = Double.valueOf(JOptionPane.showInputDialog("Cantidad a retirar"));

                if(cantidad >= getDinero()){
                    System.out.println("No se ha retirado ninguna cantidad");
                }else{
                    setDinero(getDinero() - cantidad);
                    System.out.println("Se ha retirado " + cantidad + "€ en tu cuenta");

                }
            } catch (Exception e) {
                System.err.println("Es un error de tipo " + e.getMessage());
            }
        return getDinero();
    }

    public String verCantidad(){
        return "Dispones de un total de " + getDinero() + "€ en tu cuenta bancaria";
    }
}
