package feature;

import java.util.*;

public class CollectionsGuide {
    public static void main(String[] args) {


        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("Kotlin");
        lenguajes.add("Java");
        lenguajes.add("Phyton");
        lenguajes.add("C++");
        lenguajes.add("TypeScript");

        //Recorrer la lista
        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }

        lenguajes.sort(Comparator.comparing(String::length));

        System.out.println("El elemento Java exsite? " + lenguajes.contains("Javas"));

        System.out.println("El elemento del indice 1 es: " + lenguajes.get(1));
        lenguajes.set(3, "Golang");

        System.out.println("Removiendo el ultimo lenguaje");
        lenguajes.remove(4);

        for (String lenguaje :lenguajes){
            System.out.println(lenguaje);
        }

        // LIST
        // Sistema de calificaciones usando una List
        List<Double> calificaciones = new ArrayList<>();

        calificaciones.add(11.4);
        calificaciones.add(18.0);
        calificaciones.add(13.4);
        calificaciones.add(14.5);
        calificaciones.add(16.5);

        //Calcula promedio

        double suma = 0;
        for (Double calificacion :calificaciones){
            suma += calificacion;
        }

        double promedio = suma / calificaciones.size();
        System.out.println("Su primededio es " + promedio);

        // Encontrar el minimo y maximo

        double min = Collections.min(calificaciones);
        double max = Collections.max(calificaciones);
        System.out.println("La nota mas alta y minima es: " + max + " , " + min);

        // Buscar un elemento

        System.out.println("EL elemento 18.0 existe en la lista? " + calificaciones.contains(18.0));

        // SETS

        List<String> paises = new ArrayList<>();

        paises.add("Peru");
        paises.add("Colombia");
        paises.add("Panama");
        paises.add("Peru");

        for (String pais : paises){
            System.out.println(pais);
        }

        // Maps -> tipo clave valor
        // No necesitas el orden -> HashMap
        // Si necesitas el orden por insercion o LRU simple -> LinkedHashMap
        // Ordern por comparador -> TreeMap

        Map<String, Integer> edades = new HashMap<>();

        edades.put("Pepito", 28);
        edades.put("Uriel", 23);
        edades.put("Paula", 21);

        System.out.println("La edad de Paula es: " + edades.get("Paula"));
        System.out.println("La persona Uriel existe en mi lista? " +edades.containsKey("Marcelo"));

        for (var e : edades.entrySet()){
            String nombre = e.getKey();
            Integer edad = e.getValue();
            System.out.println(nombre + "->" + edad);
        }

        //Streams nueva forma de iterar
        edades.forEach((clave ,valor ) -> System.out.println(clave + " tiene " + valor));
        //edades.forEach((clave, valor) -> System.out.println(clave + " tiene " + valor));

        // Queue
        Queue<Integer> q1 = new ArrayDeque<>();

    }
}
