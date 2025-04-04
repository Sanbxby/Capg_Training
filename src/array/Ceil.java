package array;

import java.util.Scanner;

public class Ceil {
	public static void ceil(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
		int index=0;
		
		while(left<=right) {
			int mid=left+(right-left)/2;
			
			if(arr[mid]==target) {
			System.out.println(mid);
			return;
			}
			
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				index=mid;
				right=mid-1;
			}
		}
		System.out.println(index);
	}
		
		
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {2,5,7,9,12,24,42};
		int target=12;
		 ceil(arr,target);
		
	}
}
		



