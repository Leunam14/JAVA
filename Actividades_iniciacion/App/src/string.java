public class string {
  
    public static void main(String[] args) {
        
        String miNombre = "Chema";

        System.out.println(miNombre.length());
        System.out.println(miNombre.charAt(4));
        System.out.println(miNombre.substring(1, 3));

        String miNombre2 = "chema";

        System.out.println(miNombre.equals(miNombre2));
        System.out.println(miNombre.equalsIgnoreCase(miNombre2));
        
    }
}
