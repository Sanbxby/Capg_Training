package array;

public class Rowsum {
	public static void even(int arr[][]) {
		int sum=0;

		for(int k=0;k<arr[0].length;k++) {
			for(int i=0;i<arr.length;i++) {

				sum+=arr[i][k];

			}
			System.out.println("Sum for column  "+k+" "+sum);
			sum=0;
		}

	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		even(arr);
	}
}
