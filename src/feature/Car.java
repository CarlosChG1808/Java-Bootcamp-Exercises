package feature;

public class Car {

    // Atributos
    String color;
    String marca;
    String modelo;

    //Crear Contructor Alt+Espacio (shortcut)

    //Constructor por defecto
    public Car() {
    }

    public Car(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

   public void acelerate(){
       System.out.println("Acelerando");
   }

   public void stop(){
       System.out.println("Stop");
   }
}
