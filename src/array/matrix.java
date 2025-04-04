package array;

public class matrix {
public static int even(int arr[][]) {
	int sum=0;
	
	for(int i=0;i<arr.length;i++) {
		for(int k=0;k<arr[0].length;k++) {
			if(arr[i][k]%2==0) {
				sum+=arr[i][k];
			}
		}
	}
	return sum;
	}

	public static void main(String[] args) {
	int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	System.out.println(even(arr));
	}
}
