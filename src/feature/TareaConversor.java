package feature;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TareaConversor {
    //Metodo para que valide valor numerico entero para las opciones a legir de los menus (opcion y opcioncalcladora) es int
    public static int reconoceEntero(Scanner sc){
        while (!sc.hasNextInt()){
            System.out.println("Error: Debe colocar un numero de las opciones mensionadas, \n Escriba nuevamente:");
            sc.next();
        }
        return sc.nextInt();
    }

    //Metodo para que valide valor numerico que se le da las operaciones en la calculadora
    public static double reconoceNumero(Scanner sc){
        while (!sc.hasNextDouble()){
            System.out.println("Error: Debe colocar un numero, \n Escriba nuevamente:");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("BIEVENIDO AL CONVERSOR DE MONEDAS");
        System.out.println("===============================");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto que desea cambiar");
        while (!sc.hasNextDouble()){
            System.out.println("Error: Debe ingresar un monto numerico, \n Vuelva a intentarlo:");
            sc.next();
        }

        double monto = sc.nextDouble();
        boolean continuar = true;

        while (continuar) {
            if (monto <= 0){
                System.out.println("El monto debe ser mayor a 0");
            }
            else {
                System.out.println("\n========== ELIJA SU MONEDA DE CAMBIO ==========");
                System.out.println("1. Convertir Soles a Dólares");
                System.out.println("2. Convertir Soles a Euros");
                System.out.println("3. Convertir Soles a Yenes");
                System.out.println("4. Convertir Soles a Rublos");
                System.out.println("5. Calculadora");
                System.out.println("6. Salir");
                System.out.println("==========================================");

                int opcion;
                double montoconvertido = 0;

                opcion = reconoceEntero(sc);

                switch (opcion){
                    case 1:
                        montoconvertido = monto * 0.28;
                        System.out.println("=======================");
                        // printf da formato para que tenga 2 decimales a la respuesta
                        System.out.printf("El monto convertido es: %.2f Dólares\n", montoconvertido);
                        System.out.println("=======================");
                        break;
                    case 2:
                        montoconvertido = monto * 0.24;
                        System.out.println("=======================");
                        System.out.printf("El monto convertido es: %.2f Euros\n", montoconvertido);
                        System.out.println("=======================");
                        break;
                    case 3:
                        montoconvertido = monto * 42.03;
                        System.out.println("=======================");
                        System.out.printf("El monto convertido es: %.2f Yenes\n", montoconvertido);
                        System.out.println("=======================");
                        break;
                    case 4:
                        montoconvertido = monto * 22.51;
                        System.out.println("=======================");
                        System.out.printf("El monto convertido es: %.2f Rublos\n", montoconvertido);
                        System.out.println("=======================");
                        break;
                    case 5:
                        boolean opcionvalida = true;
                        //monto = sc.nextDouble();
                        while(opcionvalida){
                            System.out.println("\n========== BIENVENIDO A LA CALCULADORA ==========");
                            System.out.println("===================================================");
                            System.out.println("¿Que tipo de operacion desea realizar?");
                            System.out.println("1.Suma");
                            System.out.println("2.Resta");
                            System.out.println("3.Multiplicación");
                            System.out.println("4.División");
                            System.out.println("5.Regresar al Conversor de Monedas");
                            System.out.println("6.Salir");
                            System.out.println("==========================================");

                            double n1;
                            double n2;
                            double resultado;
                            int opcioncalculadora = reconoceEntero(sc);

                            switch (opcioncalculadora){
                                case 1:
                                    System.out.println("=======================");
                                    System.out.println("Ingrese primero numero");
                                    System.out.println("=======================");
                                    n1 = reconoceNumero(sc);
                                    System.out.println("=======================");
                                    System.out.println("Ingrese segundo numero");
                                    System.out.println("=======================");
                                    n2 = reconoceNumero(sc);
                                    System.out.println("=======================");
                                    resultado = n1 + n2;
                                    System.out.printf("La suma de los numeros es: %.2f\n", resultado);
                                    System.out.println("=======================");
                                    break;
                                case 2:
                                    System.out.println("=======================");
                                    System.out.println("Ingrese primero numero");
                                    System.out.println("=======================");
                                    n1 = reconoceNumero(sc);
                                    System.out.println("=======================");
                                    System.out.println("Ingrese segundo numero");
                                    System.out.println("=======================");
                                    n2 = reconoceNumero(sc);
                                    System.out.println("=======================");
                                    resultado = n1 - n2;
                                    System.out.printf("La resta de los numeros es: %.2f\n", resultado);
                                    System.out.println("=======================");
                                    break;
                                case 3:
                                    System.out.println("=======================");
                                    System.out.println("Ingrese primero numero");
                                    System.out.println("=======================");
                                    n1 = reconoceNumero(sc);
                                    System.out.println("=======================");
                                    System.out.println("Ingrese segundo numero");
                                    System.out.println("=======================");
                                    n2 = reconoceNumero(sc);
                                    System.out.println("=======================");
                                    resultado = n1 * n2;
                                    System.out.printf("La multiplicación de los numeros es: %.2f\n", resultado);
                                    System.out.println("=======================");
                                    break;
                                case 4:
                                    System.out.println("=======================");
                                    System.out.println("Ingrese primero numero");
                                    System.out.println("=======================");
                                    n1 = reconoceNumero(sc);
                                    System.out.println("=======================");
                                    System.out.println("Ingrese segundo numero");
                                    System.out.println("=======================");
                                    n2 = reconoceNumero(sc);
                                    System.out.println("=======================");
                                    if (n2 != 0) {
                                        resultado = n1 / n2;
                                    System.out.printf("La división de los numeros es: %.2f\n", resultado);
                                    System.out.println("=======================");
                                    }
                                    else {
                                        System.out.println("Error: Division entre 0 no permitida");
                                    }
                                    break;
                                case 5:
                                    System.out.println("=======================");
                                    System.out.println("Regresando al Conversor de Monedas");
                                    System.out.println("=======================");
                                    opcionvalida = false;
                                    break;
                                case 6:
                                    System.out.println("=======================");
                                    System.out.println("Saliendo del sistema");
                                    System.out.println("=======================");
                                    opcionvalida =false;
                                    continuar = false;
                                    break;
                                default:
                                    System.out.println("Error: Opcion Invalida");
                                    opcionvalida =false;
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Saliendo del programa");
                        continuar = false;
                        break;
                    default:
                }
            }
        }

    }
}
