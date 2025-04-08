package Sorting;

import java.util.Scanner;

public class Bubble {
	public static void bubble(int arr[]) {
		boolean swapped;
		for(int i=0;i<arr.length;i++) {
			swapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if (arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
				
			}
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
		bubble(arr);
		
		
		
		// TODO Auto-generated method stub

	}

}
