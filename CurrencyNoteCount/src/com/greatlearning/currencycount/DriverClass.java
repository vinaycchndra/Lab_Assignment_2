package com.greatlearning.currencycount;

import java.util.Scanner;

public class DriverClass {

	
	public static void main(String [] args) {
		
		// Taking all the inputs required: denominations  
		
		System.out.println("Enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int currencyArray [] = new int [size];
		System.out.println("Enter the currency denomination value");
		for (int i=0; i<size; i++) {
			currencyArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		//Using insertion sort static method to sort the element in descending order
		InsertionSort.insertionSorting(currencyArray);		
		sc.close();
		
		// Creating object of NoteCount 
		NoteCount obj = new NoteCount();
		
		// Counting the notes with countNote method of NoteCount class
		obj.countNote(amount, currencyArray);
	}
	
}
