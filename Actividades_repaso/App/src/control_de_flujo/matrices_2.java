package control_de_flujo;
public class matrices_2 {
    
    public static void main(String[] args) {
        
        int [] [] matriz = new int [3] [4];

        matriz [0] [0] = 15;
        matriz [0] [1] = 58;
        matriz [0] [2] = 67;
        matriz [0] [3] = 18;

        matriz [1] [0] = 47;
        matriz [1] [1] = 8;
        matriz [1] [2] = 64;
        matriz [1] [3] = 12;
        
        matriz [2] [0] = 14;
        matriz [2] [1] = 37;
        matriz [2] [2] = 98;
        matriz [2] [3] = 64;
        
        //System.out.println(matriz [0] [4]);

        /* for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        } */

        for (int[] i : matriz) {
            System.out.println();

            for (int j : i) {

                System.out.print(j + " ");
                
            }
        }

    
        
    }
}
