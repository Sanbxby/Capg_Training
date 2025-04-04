package array;

public class Transpose {
	public static void matrix(int arr[][],int res[][]) {
		

		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[0].length;k++) {
              res[k][i]=arr[i][k];

			}
			
		}
		for(int i=0;i<res.length;i++) {
			for(int k=0;k<res[0].length;k++) {
				System.out.print(res[i][k]+" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int res[][] =  new int[arr.length][arr[0].length];
		matrix(arr,res);
	}
}
