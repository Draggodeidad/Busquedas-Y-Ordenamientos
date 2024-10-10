package examples;

import java.util.Arrays;

import SortAndSearch.SortAndSearch;

public class SortExamples {
    public static void main(String[] args) {
        SortAndSearch<Integer> sorter = new SortAndSearch<>();

        // Ejemplo de ordenamiento por selección
        Integer[] numbers = { 5, 2, 8, 1, 3 };
        sorter.selectionSort(numbers);
        System.out.println("Ordenamiento por selección: " + Arrays.toString(numbers));

        // Ejemplo de ordenamiento por inserción
        Integer[] numbers2 = { 5, 2, 8, 1, 3 };
        sorter.insertionSort(numbers2);
        System.out.println("Ordenamiento por inserción: " + Arrays.toString(numbers2));

        // Ejemplo de ordenamiento burbuja
        Integer[] numbers3 = { 5, 2, 8, 1, 3 };
        sorter.bubbleSort(numbers3);
        System.out.println("Ordenamiento por burbuja: " + Arrays.toString(numbers3));
    }
}
