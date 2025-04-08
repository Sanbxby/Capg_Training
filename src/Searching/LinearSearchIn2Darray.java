package Searching;

import java.util.*;
public class LinearSearchIn2Darray {

	public static  int[] LinearSearch(int arr[][],int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					return new int[] {i,j};
				}
			}
		}

		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]= {{1,5},{7,9},{9,2}};
		int target=sc.nextInt();
		int[] finaly=LinearSearch(arr,target);
		System.out.println(Arrays.toString(finaly));

	}

}
