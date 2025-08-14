package feature;

import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo: ");
        int size = input.nextInt();
        int[] numbers = new int [size];

        for (int i = 0; i < size ; i++){
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
    }
}
