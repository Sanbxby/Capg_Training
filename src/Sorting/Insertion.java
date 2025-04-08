package Sorting;

import java.util.Scanner;

public class Insertion {
	public static void InsertionSort(int arr[]) {
	for(int i=1;i<arr.length;i++) {
		int key=arr[i];
		int j=i-1;
		
		while(j>=0 && j>key) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
	
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();

		}
		InsertionSort(arr);
		
		
		
		// TODO Auto-generated method stub

	}

}
		