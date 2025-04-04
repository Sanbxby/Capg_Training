package array;

import java.util.Arrays;
public class Binary {
	public static int binarySearch(int arr[],int target) {
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		
		
		while(left<=right) {
			int mid=(left+right)/2;
	
			if(arr[mid]==target) {
				return mid;
			}
		
		else if(arr[mid]<target) {
			left=mid+1;
		}
		else {
			right=mid-1;
		}
		
	
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {23,43,25,56,71,89};
		int target=25;
		System.out.println(binarySearch(arr,target));
		
	}
}

