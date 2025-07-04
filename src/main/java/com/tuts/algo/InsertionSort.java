package com.tuts.algo;

public class InsertionSort {
    private int[] arr;

    // Constructor
    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public void example() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i -> " + i);

            for (int j = 0; j < arr.length; j++) {
                System.out.println();
                System.out.println(" j -> " + j + " arr[j] -> " + arr[j]);
            }
            System.out.println();
        }
    }

    public void insertionSort() {
        int lengthOfArr = this.arr.length;

        for (int i = 1; i < lengthOfArr; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    public void printArray() {
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        InsertionSort insertionSort = new InsertionSort(arr);

        insertionSort.insertionSort();
        insertionSort.printArray();
    }
}