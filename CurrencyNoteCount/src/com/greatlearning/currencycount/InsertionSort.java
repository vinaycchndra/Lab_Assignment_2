package com.greatlearning.currencycount;

public class InsertionSort {
	
	
	public static void insertionSorting(int [] arr){
		int temp, element, j;
		for (int i=1; i<arr.length; i++) {
			element = arr[i];
			j = i-1;
			//System.out.println(i);
			while ((j>=0) && (element>arr[j])) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
			arr[j+1] = element;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {100, 20};
		System.out.println("The values in the array before sorting are: ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		insertionSorting(arr);
		System.out.println("The values in the array after sorting are: ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
