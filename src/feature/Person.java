package feature;

public class Person {
    String nombres;
    String apellidos;
    String dni;
    String email;

    public Person() {
    }

    public Person(String nombres, String apellidos, String dni, String email) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
    }

    public void walk(){
        System.out.println("Hola soy " +nombres + " " + apellidos + " y estoy caminando");
    }

    public void run(){
        System.out.println("Hola soy " +nombres + " " + apellidos + " y estoy corriendo");
    }
}
