package feature;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("Ejemplo 1:");
        System.out.println("===========================");

        //Imprimir del 1 al 10
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("===========================");
        System.out.println("Ejemplo 2:");
        System.out.println("===========================");

        System.out.println("Tabla de multiplicar:");
        System.out.println("===========================");

        Scanner sc = new Scanner(System.in);

        System.out.println("Hey, ingresa el numero que deseas multiplicar:");
        int tablaMultiplicar = sc.nextInt();

        //Tabla de multiplicar
        //Tabla del 12
        for (int i = 1; i <= 12; i++){
            System.out.println(tablaMultiplicar + " x " + i + " = " + i* tablaMultiplicar);
        }

        System.out.println("===========================");
        System.out.println("Ejemplo 3:");
        System.out.println("===========================");

        //Cuenta regresiva de 5 a 1
        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }

        //Bucles anidadas
        System.out.println("===========================");
        System.out.println("Ejemplo 4:");
        System.out.println("===========================");

        // Imprimir encabezados
        for (int j = 1; j <= 5; j++) {
            System.out.print("Tabla del " + j + "\t");
        }
        System.out.println("|");

        for (int i = 1; i <=3 ; i++){
            for (int j = 1 ; j <= 5 ; j++){
                System.out.print(i +" x " + j + " = " + (i*j) + "\t");
            }
            System.out.println("|");
        }

        sc.close();
    }
}
