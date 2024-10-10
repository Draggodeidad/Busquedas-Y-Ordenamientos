package SortAndSearch;

public class SortAndSearch<T extends Comparable> {

    // Busquedas

    // metodo busqueda lineal
    public boolean linealSearch(T[] data, int min, int max, T target) {
        int index = min;
        boolean found = false;

        while (!found && index <= max) {
            if (data[index].compareTo(target) == 0) {
                // -1->inferior, 0->igual, 1->mayor
                found = true;
            }
            index++;
        }
        return found;
    }

    // metodo busquedabinaria
    public boolean binarySearch(T[] data, int min, int max, T target) {
        boolean found = false;
        int midpoint = (min + max) / 2;

        if (data[midpoint].compareTo(target) == 0) {
            found = true;
        } else if (data[midpoint].compareTo(target) > 0) {
            if (min <= midpoint - 1) {
                found = binarySearch(data, min, midpoint - 1, target);
            }
        } else if (midpoint + 1 <= max) {
            found = binarySearch(data, midpoint + 1, max, target);
        }
        return found;

    }

    // Ordenamientos

    // Metodo de selección
    public void selectionSort(T[] data) {

        int min;
        T temp;

        for (int index = 0; index < data.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < data.length; scan++) {
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }
            }
            temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }
    }

    // ordenacion por inserción
    public void insertionSort(T[] data) {
        for (int index = 1; index < data.length; index++) {
            T key = data[index];
            int position = index;

            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1]; // desplaza hacia la derecha
                position--;
            }
            data[position] = key;
        }
    }

    // metodo burbuja
    public void bubbleSort(T[] data) {
        int position, scan;
        T temp;

        for (position = data.length - 1; position >= 0; position--) {
            for (scan = 0; scan <= position - 1; scan++) {
                if (data[scan].compareTo(data[scan + 1]) > 0) {
                    // intercambio
                    temp = data[scan];
                    data[scan] = data[scan + 1];
                    data[scan + 1] = temp;

                }
            }
        }
    }

    // metodos logaritmicos
    // 1. Ordenamiento Rapido

    public void quickSort(T[] data, int min, int max) {

        int indexOfPartition; // pivote

        if (max - min > 0) {
            // crear particion
            indexOfPartition = findPartition(data, min, max);

            // ordena el lado izquierdo
            quickSort(data, min, indexOfPartition - 1);

            // ordena el lado derecho
            quickSort(data, indexOfPartition + 1, max);
        }
    }

    private int findPartition(T[] data, int min, int max) {
        int left, right;
        T temp, partitionElement;

        // pivote
        partitionElement = data[min];
        left = min;
        right = max;

        while (left < right) {
            while (data[left].compareTo(partitionElement) <= 0 && left < right) {
                right--;
            }
            // intercambio
            if (left < right) {
                temp = data[left];
                data[left] = data[right];
                data[right] = temp;
            }
        }
        // mover el elemento hasta el pivote
        temp = data[min];
        data[min] = data[right];
        data[right] = temp;
        return right;
    }

    // ordenacion mezcla o combinación

    public void mergeSort(T[] data, int min, int max) {

        T[] temp;
        int index, left, right;

        // busca la lista de longitud 1
        if (min == max) {
            return;
        }

        // calcular la longitud y el punto de las lista
        int size = max - min + 1;
        int pivot = (min + max) / 2;

        temp = (T[]) (new Comparable[size]);

        // ordenar la mitad izquierda
        mergeSort(data, min, pivot);

        // ordenas la mitad derecha
        mergeSort(data, pivot + 1, max);

        // copiar los datos de manera ordenada
        for (index = 0; index < size; index++) {
            temp[index] = data[min + index];
        }

        // mezcla de listas ordenadas
        left = 0;
        right = pivot - min + 1;

        for (index = 0; index < size; index++) {
            if (right <= max - min) {
                if (left <= pivot - min) {
                    if (temp[left].compareTo(temp[right]) > 0) {
                        data[index + min] = temp[right++];
                    } else {
                        data[index + min] = temp[left++];
                    }
                } else {
                    data[index + min] = temp[right++];
                }
            } else {
                data[index + min] = temp[left++];
            }
        }

    }
}