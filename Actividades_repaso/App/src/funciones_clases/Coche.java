package funciones_clases;

public class Coche {

    //atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    public Coche(){
        
    }

    //constructores permiten crear objetos de esta clase
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color; //this.color hace referencia a la propiedad del objeto, y color a la de fuera
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    public void acelerar (Integer cantidad){
        if(cantidad <= 120){
            this.velocidad += cantidad;

        }

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Coche{" + 
                "color='" + color + '\'' +
                ", fabricante ='" + fabricante + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", peso = '" + peso + '\'' +
                ", largo = '" + largo + '\'' +
                ", velocidad = '" + velocidad +
                '}';
    }
}
