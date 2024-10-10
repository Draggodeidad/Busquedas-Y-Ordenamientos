package examples;

import SortAndSearch.SortAndSearch;

public class SearchExamples {
    public static void main(String[] args) {
        SortAndSearch<Integer> searcher = new SortAndSearch<>();

        // Ejemplo de búsqueda lineal
        Integer[] numbers = { 5, 2, 8, 1, 3 };
        boolean found = searcher.linealSearch(numbers, 0, numbers.length - 1, 8);
        System.out.println("Búsqueda lineal: ¿Se encontró 8? " + found);

        // Ejemplo de búsqueda binaria
        Integer[] sortedNumbers = { 1, 2, 3, 5, 8 };
        found = searcher.binarySearch(sortedNumbers, 0, sortedNumbers.length - 1, 3);
        System.out.println("Búsqueda binaria: ¿Se encontró 3? " + found);
    }
}
