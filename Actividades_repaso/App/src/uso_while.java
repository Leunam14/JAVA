import javax.swing.*;

public class uso_while {
    
    public static void main(String[] args) {
        
        String clave = "Leunam";

        String pass = "";

        while(clave.equalsIgnoreCase(pass) == false){

            pass = JOptionPane.showInputDialog("Introduce la contraseña");

            if (clave.equalsIgnoreCase(pass) == true){

                System.out.println("Clave aceptada");
            }else{
                System.out.println("Clave errónea");
            }
        }
    }
}
