package com.tuts.algo;

public class SelectionSort {
	private int[] arr; // This line declares a private array of integers named arr in java class
	
	// this is the constructor for a java class named selection sort. This allows us to pass an integer array when creating an object of selction sort class
	public SelectionSort(int[] arr) { 
		this.arr = arr;
		
	}
	public void example () { // 
		for (int i = 0; i < arr.length; i++) {
			System.out.println ("i ->" + i);
			
			for (int j = 0; j < arr.length; j++) {
				System.out.println();
				System.out.println(" j- " + j +" arr[j + 1]" + arr[j + 1]+ " , ");
				
			}
			System.out.println();
		}
		
	}
	
	public void selectionSort() {
		int lengthOfArr = this.arr.length;
		
		for (int i= 0; i < lengthOfArr - 1; i++) {
			System.out.println("arr[" + i + "] --->" + arr[i]);
			
			int min_idx = i;
			 for (int j = i + 1; j < lengthOfArr - 1; j++) {
				 if (arr[j] < arr[min_idx]) {
					 min_idx = j;
				 }
			 }
			 int tmp = arr[min_idx];
			 arr[min_idx] = arr[i];
			 arr[i] = tmp;
			 
			 
		}
	}
	
	public void printArray() {
		System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
	}
	
	public static void main ( String [] args) {
		int[] arr = { 5 , 2, 8, 1, 3 };
		SelectionSort selectionSort = new SelectionSort(arr);
		
		selectionSort.selectionSort();
		selectionSort.printArray();
	}
	

}
