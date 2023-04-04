package com.greatlearning.transaction;
import java.util.Scanner;

public class TransactionTarget{
	// Object attributes for size and array
	private int [] array;
	private int size;
	
	// Constructor initializing the input array size and array
	TransactionTarget(int s, int [] arr){
		size = s;
		array = arr;
	}
	
	// Function to evaluate target achievement
	public void evaluate(int target) {
		//Sum variable to keep track of target achieved in every iteration
		
		int sum=0;
		for (int i=1; i<=size; i++) {
			sum = sum+array[i-1];
			
			if (sum>=target) {
				System.out.println("Target is achieved after "+i+" transactions"+"\n");
				return;
			}
		}
		System.out.println("Given target is not achieved");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array: ");
		int s = sc.nextInt();
		int [] arr = new int [s];
		System.out.println("Enter the values of array");
		
		for (int i=0; i<s; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no. of targets that needs to be achieved");
		int z = sc.nextInt();
		System.out.println();
		TransactionTarget obj = new TransactionTarget(s, arr);
		
		for (int i=0; i<z; i++) {
			System.out.println("Enter the value of target");
			obj.evaluate(sc.nextInt());
		}
		sc.close();
	}

}
