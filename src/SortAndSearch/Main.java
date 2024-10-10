package SortAndSearch;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // busqueda lineal
        Integer[] numeros = { 5, 4, 3, 8, 1, 7, 9, 1 };
        SortAndSearch<Integer> s = new SortAndSearch<>();

        System.out.println("Busqueda Lineal de numeros: " + s.linealSearch(numeros, 0, 4, 111));

        String[] nombres = { "maria", "hugo", "paco", "luis", "pedro", "yedid" };
        SortAndSearch<String> n = new SortAndSearch<>();

        System.out.println("Busqueda Lineal de Nombres: " + n.linealSearch(nombres, 0, nombres.length - 1, "hugo"));

        // busqueda binaria
        // Regla: los elementos del arreglo DEBEN estar ordenados
        Integer[] numeros2 = { 2, 3, 8, 16, 24, 31, 40, 49, 65, 78, 122 };
        System.out.println("Busqueda Binaria de numeros: " + s.binarySearch(numeros2, 0, numeros2.length - 1, 125));

        // Ordenacion
        // Ordenacion por seleccion
        s.selectionSort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ordenacion x seleccion: " + numeros[i]);
        }

        n.selectionSort(nombres);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("ordenacion x seleccion: " + nombres[i]);
        }

        // Ordenacion ppor insercion
        s.insertionSort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ordenacion x insercion: " + numeros[i]);
        }

        n.insertionSort(nombres);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("ordenacion x insercion: " + nombres[i]);
        }

        // metodo burbuja
        s.bubbleSort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ordenacion x metodo burbuja: " + numeros[i]);
        }

        n.bubbleSort(nombres);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("ordenacion x metodo burbuja: " + nombres[i]);
        }
        System.out.println("Busqueda Binaria de nombres: " +
                n.binarySearch(nombres, 0, nombres.length - 1, "ana"));

        // quick sort
        System.out.println("***Ordenamiento Rapido*** ");
        s.quickSort(numeros, 0, numeros.length - 1);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ordenacion rapida: " + numeros[i]);
        }

        // merge sort
        System.out.println("***Ordenamiento x Mezcla*** ");
        s.mergeSort(numeros, 0, numeros.length - 1);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ordenacion x mezcla: " + numeros[i]);
        }

        ArrayList<Integer> a = new ArrayList<>();

    }
}
