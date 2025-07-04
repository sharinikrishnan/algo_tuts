package com.tuts.algo;

public class BubbleSort {
	private int[] arr;
	
	public BubbleSort(int[] arr){
		
		this.arr = arr;
	}
	
	
	public void example() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("i ---> " + i);
			
			for (int j = 0; j < arr.length; j++) {
				//System.out.print("j-" + j +" arr[j] " +  arr[j]  + " ,");
				System.out.println();
				System.out.print("j-" + j +" arr[j + 1] " +  arr[j + 1]  + " ,");
			}
			System.out.println();
		}
	}
	public void bubbleSort() {
	  int lengthOfArr = this.arr.length;
	  
	  int count = 0;
	  System.out.println("legnth of the array is " + lengthOfArr );
	  for (int i = 0; i < lengthOfArr - 1; i++) {
		  System.out.println("arr[" + i + "]   --->   " + arr[i] ); // nested for loop
		  for (int j = 0; j < lengthOfArr - 1; j++) {
			  System.out.println("arr[" + j + "]   --->   " + arr[j] );
			  System.out.println("arr[" + j + " + 1]   --->   " + arr[j + 1] );
			  count = count + 1;
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1]; 
					arr[j + 1] = tmp;
					
				}
			}
	  }
	  System.out.println ("length of array" + arr.length);
	  System.out.println ("count = " + count);
	}
	
	public void printArray() {
		System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
	}
	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 1, 3}; 
	    BubbleSort bubbleSort = new BubbleSort(arr); 
	   bubbleSort.bubbleSort(); 
	   bubbleSort.printArray();
	    //bubbleSort.example();
	}
}
