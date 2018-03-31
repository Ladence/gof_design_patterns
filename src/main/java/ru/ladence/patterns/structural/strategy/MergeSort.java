package ru.ladence.patterns.structural.strategy;


public class MergeSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        mergeSortUtil(array, 0, array.length - 1);
    }

    private void merge(int[] array, int l, int m, int r) {
        int sz1 = m - l + 1;
        int sz2 = r - m;

        int[] left = new int[sz1];// = Arrays.copyOfRange(array, l, l + sz1 - 1);
        int[] right = new int[sz2];// = Arrays.copyOfRange(array, m + 1, sz2);
        for (int i = 0; i < sz1; i++) {
            left[i] = array[l + i];
        }
        for (int j = 0; j < sz2; j++) {
            right[j] = array[m + j + 1];
        }

        int k = l;
        int i = 0;
        int j = 0;
        while (i < sz1 && j < sz2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < sz1) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < sz2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    private void mergeSortUtil(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) >> 1;
            mergeSortUtil(arr, l, m);
            mergeSortUtil(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

}
