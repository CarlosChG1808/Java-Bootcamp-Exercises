import feature.Car;
import feature.Person;

import java.util.Scanner;

// This is the main class.
public class Main {

    // This is the main driver method.
    public static void main(String[] args) {
// This is the standard print statement
        System.out.println("Welcome to Codigo Tecsup");
        //Este objeto es una instacia de la clase Car
        Car lamborghini = new Car();
        lamborghini.acelerate();
        lamborghini.stop();

        //Este objeto es una instacia de la clase Person
        //Person carlos = new Person();
        //carlos.walk();
        //carlos.run();

        Person roberto = new Person("Roberto", "Gonzales", "7596489", "rgonzales@gmail.com");
        roberto.walk();
        roberto.run();



        //CALCULADORA
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int primernumero = scanner.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int segundonumero= scanner.nextInt();

        int suma = primernumero + segundonumero;
        int resta = primernumero - segundonumero;
        int multiplicacion = primernumero * segundonumero;
        int division = primernumero / segundonumero;


        System.out.println("La suma de los dos numeros es: " +suma);
        System.out.println("La suma de los dos numeros es: " +resta);
        System.out.println("La suma de los dos numeros es: " +multiplicacion);
        System.out.println("La suma de los dos numeros es: " +division);


        scanner.close();
    }




    private static int sumar(int a, int b) {
        return a + b;
    }
}