package Searching;

public class Linear {
	public static int Linear(int arr[],int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				return i;
			}
		}
			
				return -1;
		
	}
	
public static void main(String[] args) {
		int arr[]= {10,12,8,6,13,14};
		int k=11;
		int result=Linear(arr,k);
		System.out.println(result);
		
		
		
		
		
	}

}
