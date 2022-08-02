import javax.swing.*;

public class matrices {
    
    public static void main(String[] args) {
        
        /* int [] ejemplo_matriz = new int [10];

        //int [] ejemplo_matriz ={7, 27, 14, 38, 48, 67, 20, 68};

        ejemplo_matriz [0] = 7;
        ejemplo_matriz [1] = 27;
        ejemplo_matriz [2] = 14;
        ejemplo_matriz [3] = 38;
        ejemplo_matriz [4] = 48;
        ejemplo_matriz [5] = 67;
        ejemplo_matriz [6] = 20;
        ejemplo_matriz [7] = 69;

        System.out.println(ejemplo_matriz[5]);

        System.out.println(ejemplo_matriz.length);

        for (int i = 0; i < ejemplo_matriz.length; i++){
            System.out.println(ejemplo_matriz[i]);
        }

        -------------------------------------------------------
    */

        /* String [] paises = {"España", "Italia", "Alemania", "Reino Unido", "Perú", "Chile", "Japón", "México"};

        for (String i : paises) {
            
            System.out.println(i);
        } 
        
        -------------------------------------------------------
        */

        String [] paises = new String [3];

        for (int i = 0; i < paises.length; i++) {
            paises [i] = JOptionPane.showInputDialog("Introduce el nombre del páis: ");

        }

        for (String j : paises) {
            
            System.out.println(j);
        }

    }

}
