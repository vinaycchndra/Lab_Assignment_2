package com.greatlearning.currencycount;
public class NoteCount {

	public void countNote(int amount, int [] currencyNote) {
		int arr [] = new int [currencyNote.length];
		for (int i=0; i<arr.length; i++) {
			// main logic of the program 
			arr[i] =  amount/currencyNote[i];
			amount = amount%currencyNote[i];
		}
		if (amount>0) {
			System.out.println("Denomination not possible");
		}
		else {
			for (int i=0; i<arr.length; i++) {
				if (arr[i]!=0) {
					System.out.println(currencyNote[i]+" : "+arr[i]);
				}
			}
		}
	}
}
