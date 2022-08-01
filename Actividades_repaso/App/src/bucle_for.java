import javax.swing.*;

public class bucle_for {

    public static void main(String[] args) {
        
        /*String nombre = "Leunam";

        for(int i = 0; i < 10; i++ ){
            System.out.println(nombre);
        }*/

        boolean arroba = false;
        
        int contador = 0;

        String correo = JOptionPane.showInputDialog("Introduce tu correo");

        for(int i = 0; i < correo.length(); i++){

            contador++;

            if (correo.charAt(i) == '@') {
                arroba = true;
                System.out.println("Email correcto");
                break;
            }else if(contador == correo.length()){

                System.out.println("Email incorrecto");

            }
        }

    }
    
}


