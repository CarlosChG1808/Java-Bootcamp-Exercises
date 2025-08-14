package feature;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        //Imprimir los 10 numeros
        int valor = 0;
        while (valor <=10){
            System.out.println(valor);

            //updation
            valor++;
        }

        boolean continuar =true;
        while (continuar){
            System.out.println("\n====Menu de patrones de Estrellas=====");
            System.out.println("===========================");
            System.out.println("1. Imprimir el triangulo equilatero");
            System.out.println("2. Imprimir el triangulo equilatero inverso");
            System.out.println("3. Imprimir la piramide");
            System.out.println("4. Salir");


            int option;
            Scanner sc = new Scanner(System.in);
            System.out.println("Elija el numero de eleccion:");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("===========================");
                    System.out.println("Ejemplo 7:");
                    System.out.println("===========================");

                    for (int i = 1; i<=5; i++){
                        for (int j = i; j<=5; j++){
                            System.out.print("* ");
                        }
                        System.out.println("|");
                    }
                    break;
                case 2:
                    System.out.println("===========================");
                    System.out.println("2. Triangulo equilatero inverso");
                    System.out.println("===========================");

                    //El primer bucle es de arriba hacia abajo
                    for (int i = 1; i<=5; i++){
                        //El segundo bucle de izquierda a derecha
                        for (int j = 1; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("|");
                    }
                    break;
                case 3:
                    System.out.println("===========================");
                    System.out.println("2. Piramide");
                    System.out.println("===========================");

                    for (int i = 1; i<=6; i++){
                        //Imprimir los espacios
                        for (int j = i; j<=6-i; j++){
                            System.out.print(" ");
                        }

                        //Imprimir asteriscos
                        for (int k = 1; k <= i; k++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Saliendo de programa");
                    continuar = false;
                    break;
                default:
            }

        }


    }

}
