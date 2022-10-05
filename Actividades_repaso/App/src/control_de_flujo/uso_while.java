package control_de_flujo;
import javax.swing.*;

public class uso_while {
    
    public static void main(String[] args) {

        validacion("Leunam", "Leunam");
        contador(7);
        
    }

    private static void validacion(String clave, String pass){

        while(clave.equalsIgnoreCase(pass) == false){

            //pass = JOptionPane.showInputDialog("Introduce la contraseña");

            if (clave.equalsIgnoreCase(pass) == true){

                System.out.println("Clave aceptada");
            }else{
                System.out.println("Clave errónea");
            }
        }
    }
        
    private static int contador(int count){
      
        //USO DE CONTINUE
        
        while(count <10){
            count++;
            if(count == 6)
                continue;//Con esto saltaría el código de debajo y por lo tanto el 6 no se muestra en pantalla

            System.out.println("El contador vale " + count);
        }

        return count;
    }
        
}
