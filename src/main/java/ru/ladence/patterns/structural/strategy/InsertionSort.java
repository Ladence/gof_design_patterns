package ru.ladence.patterns.structural.strategy;

public class InsertionSort implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        int key;

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            key = array[i];

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
