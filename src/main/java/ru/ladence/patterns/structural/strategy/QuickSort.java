package ru.ladence.patterns.structural.strategy;

public class QuickSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        quickSortUtil(array, 0, array.length - 1);
    }

    private void quickSortUtil(int[] array, int low, int high) {
        int pivot = array[(low + high) >> 1];

        int i = low;
        int j = high;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (j > low) {
            quickSortUtil(array, low, j);
        }
        if (i < high) {
            quickSortUtil(array, i, high);
        }
    }
}
