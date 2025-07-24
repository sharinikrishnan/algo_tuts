package com.tuts.algo;

import java.lang.reflect.Array;

public class MergeSort {

    public void sort(int[] array) {
        // Create an auxiliary array for use during merging
        
        merge_sort(array,  0, array.length - 1);
    }

    private void merge_sort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }

        int mid = start + (end - start) / 2;

        // Recursively sort the left and right halves
        merge_sort(arr, start, mid);
        merge_sort(arr, mid + 1, end);

        int i = start;
        int j = mid + 1;
        
        int[] aux = new int[arr.length];
       
        while(i <= mid && j <= end) {
        	if(arr[i] <= arr[j]) {
        		aux[i] = arr[i];
        		i++;
        
        	} else {
        		aux[j] = arr[j];
        		j++;
        		
        	}
        	
        }
       while( i <= mid) {
    	   aux[i] = arr[i]; 
    	   i++;
    	   
       }
       while(j <= end) {
    	   aux[j]= arr[j];
    	   j++;
    	   
       }
       for(int k = 0; k < aux.length; k++) {
    	   arr[start] = aux[k];
    	   start++;
    	   
       }
       return;
    		   
    }


    
        
    }
    
