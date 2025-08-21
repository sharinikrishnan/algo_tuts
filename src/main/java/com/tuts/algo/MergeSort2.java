package com.tuts.algo;

public class MergeSort2{
	private int[] array;

	public MergeSort2(int[] array) {
		this.array = array;
	}

	public void sort() {
		merge_sort(this.array, 0, this.array.length - 1);
	}

	private void merge_sort(int[] arr, int start, int end) {
		if (start == end) {
			return;
		}

		int mid = start + (end - start) / 2;

		merge_sort(arr, start, mid);
		merge_sort(arr, mid + 1, end);

		int i = start;
		int j = mid + 1;
		int k = 0;
		int[] aux = new int[end - start + 1];

		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j]) {
				aux[k] = arr[i];
				i++;
			} else {
				aux[k] = arr[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			aux[k] = arr[i];
			i++;
			k++;
		}

		while (j <= end) {
			aux[k] = arr[j];
			j++;
			k++;
		}

		for (int l = 0; l < aux.length; l++) {
			arr[start] = aux[l];
			start++;
		}
	}

	public void printArray() {
		System.out.println("Sorted array:");
		for (int i = 0; i < this.array.length; i++) {
			System.out.print(this.array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 1, 3 };

		MergeSort2 mergeSortObject = new MergeSort2(arr);
		mergeSortObject.sort();
		mergeSortObject.printArray();
	}
}