package com.tuts.algo;



public class QuickSort {
	private int[] arr;
	
	public QuickSort(int[] arr) { 
		this.arr = arr;
	}
	
	public void quickSort() {
		quickSort( this.arr, 0, arr.length - 1);
	}
	
	private void quickSort(int[] arr, int start, int end) {
		
		if(start >= end) {
			return;
		} 
		
		int pivot = start + (int) (Math.random() * (end - start) + 1);
		int pivotValue = arr[pivot];
		System.out.println(" The pivot between start " + start + " to end is " + end + " -> " + pivot + " Pivot value is = " + pivotValue);
		int temp = arr[pivot];
		arr[pivot] = arr[start];
		arr[start] = temp;
		// call lomutos partitioning
		
		int orange = start;
		
		for(int green = start + 1; green <= end; green++) {
			if(arr[green] < pivotValue) {
				orange++;
				int temp1 = arr[green];
				arr[green] = arr[orange];
				arr[orange] = temp1;
				
	
				 
			}
		}
		  int temp2 = arr[orange];
		  arr[orange]= arr[start];
		  arr[start] = temp2;
				
		// call hoares partitioning
		
		quickSort(arr, start, orange - 1);
		quickSort(arr, orange + 1, end);
		
		
	}
	
    public void printArray() {
    	System.out.println("Sorted array:");
    	for (int i = 0; i < this.arr.length; i++) {
    		System.out.print(this.arr[i]+" ");
    	}
    }

	public static void main(String[] args) {
		
		int[] arr = { 5, 2, 9, 1, 7, 3};
		
		QuickSort qs = new QuickSort(arr);
		qs.quickSort();
		qs.printArray();
		
	}
	
	

} 
	
