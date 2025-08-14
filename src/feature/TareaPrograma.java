package feature;

import java.util.Scanner;

public class TareaPrograma {
    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("BIEVENIDO AL CONVERSOR DE MONEDAS");
        System.out.println("===============================");
        System.out.println("===============================");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese monto en soles");
        double monto = sc.nextDouble();
        boolean continuar = true;

        //while (continuar){

        if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor a 0");
        } else {
            int opcion;
            double montoConvertido = 0;

            System.out.println("\n========== ELIJA SU MONEDA DE CAMBIO ==========");
            System.out.println("1. Convertir Soles a Dólares");
            System.out.println("2. Convertir Soles a Euros");
            System.out.println("3. Convertir Soles a Yenes");
            System.out.println("4. Convertir Soles a Rublos");
            System.out.println("5. Calculadora");
            System.out.println("6. Salir");
            System.out.println("==========================================");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    montoConvertido = monto * 0.28;
                    System.out.println("=======================");
                    System.out.println("El monto convertido es: " + montoConvertido + " Dolares");
                    System.out.println("=======================");
                    break;
                case 2:
                    montoConvertido = monto * 0.24;
                    System.out.println("=======================");
                    System.out.println("El monto convertido es: " + montoConvertido + " Euros");
                    System.out.println("=======================");
                    break;
                case 3:
                    montoConvertido = monto * 42.03;
                    System.out.println("=======================");
                    System.out.println("El monto convertido es: " + montoConvertido + " Yenes");
                    System.out.println("=======================");
                    break;
                case 4:
                    montoConvertido = monto * 22.51;
                    System.out.println("=======================");
                    System.out.println("El monto convertido es: " + montoConvertido + " Rublos");
                    System.out.println("=======================");
                    break;
                case 5:
                    //boolean opcionvalida = true;
                    //monto = sc.nextDouble();
                    while(continuar){
                        System.out.println("Selecciona la moneda de cambio");
                        System.out.println("1.Dólares");
                        System.out.println("2.Euros");
                        System.out.println("3.Yenes");
                        System.out.println("4.Rublos");
                        System.out.println("5.Regresar la Menu Principal");
                        System.out.println("6.Salir del Conversor de Monedas");

                        opcion =sc.nextInt();

                        switch (opcion){
                            case 1:
                                montoConvertido = monto * 0.28;
                                System.out.println(montoConvertido);
                                break;
                            case 2:
                                montoConvertido = monto * 0.24;
                                System.out.println(montoConvertido);
                                break;
                            case 3:
                                montoConvertido = monto * 42.03;
                                System.out.println(montoConvertido);
                                break;
                            case 4:
                                montoConvertido = monto * 22.51;
                                System.out.println(montoConvertido);
                                break;
                            case 5:
                                System.out.println("Regresar al Menu princial");
                                break;
                            case 6:
                                System.out.println("Saliendo del Conversor de Monedas");
                                continuar = false;
                                break;
                            default:
                                System.out.println("Error: Opcion Invalida");

                        }
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    //continuar = false;
                    break;
                default:
            }
        }
        }
    //}
}
