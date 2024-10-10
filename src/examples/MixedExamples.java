package examples;

import java.util.Arrays;

import SortAndSearch.SortAndSearch;

public class MixedExamples {
    public static void main(String[] args) {
        SortAndSearch<Integer> mixed = new SortAndSearch<>();

        // Ejemplo combinado de búsqueda y ordenamiento
        Integer[] numbers = { 5, 2, 8, 1, 3 };

        // Ordenamos primero
        mixed.selectionSort(numbers);
        System.out.println("Números ordenados: " + Arrays.toString(numbers));

        // Buscamos un elemento
        boolean found = mixed.binarySearch(numbers, 0, numbers.length - 1, 8);
        System.out.println("¿Se encontró 8 en Búsqueda Binaria? " + found);
    }
}
