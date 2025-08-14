package feature;

public class ArrayJava {
    public static void main(String[] args) {
        //list =[1, 'String', True,]
        //List<>
        //Arreglos en java solo permiten un solo tipo de dato y el tamaño es fijo
        // Indices: son un forma de acceder al vcalor de uno de los datos dentro de tu arreglo

//        int[] numeros = new int[3];
//        numeros[0] = 1;
//        numeros[1] = 2;
//        numeros[2] = 3;

        int[] numbers = {10,20,30};
        System.out.println("Elementos del arreglo Array");
        for (int i = 0; i < numbers.length; i++){
            System.out.println("El indice es " + i + " y su valor es " +numbers[i]);
        }

        //For each
        String[] frutas = {"Manzana", "Lucuma", "Naranja", "Pera"};

        for (String fruta : frutas){
            // fruta = frutas[i]
            System.out.println("La fruta es: " + fruta);
        }

        //Buscar el promedio de una lista
        double [] listaNotasdelBootcamp = {12.5,15.5,18.6,5.0,12.5,19.9,20.0,10.1,16.5};

        //calcular total de las notas
        double total = 0;

        for (double valor : listaNotasdelBootcamp){
            total += valor;
        }

        //Calculamos promedio
        double promedio = total / listaNotasdelBootcamp.length;

        System.out.println("EL total es: " + total);
        System.out.println("El promedio del estudiante es: " + promedio);
    }
}
