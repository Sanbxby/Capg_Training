package array;
import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
	public static void Array2D(int row,int column ) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		/*for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");*/
		for(int[] a:arr) {
			System.out.print(Arrays.toString(a));
			System.out.println();

			}
			
			
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();

		Array2D(row,column);
	}

}
