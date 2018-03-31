package ru.ladence.patterns.structural.strategy;

public class ArraySorter {
    private SortingStrategy sortingStrategy;

    public ArraySorter(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int []arr) {
        sortingStrategy.sort(arr);
    }

    public static void main(String[] args) {
        final int[] array = new int[]{0, -7, 6, -2, -3};
        ArraySorter instance = new ArraySorter(new MergeSort());
        instance.sort(array);
        for (int a: array) {
            System.out.println(a);
        }
    }
}
