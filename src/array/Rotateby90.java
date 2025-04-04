package array;

public class Rotateby90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[0].length;k++) {
              int temp=0;
              temp=arr[i][k];
              arr[i][k]=arr[k][i];
              arr[k][i]=temp;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr.length/2;k++) {
              int temp=0;
              temp=arr[i][k];
              arr[i][k]=arr[i][arr.length-1-k];
              arr[i][arr.length-1-k]=temp;

	}}
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[0].length;k++) {
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}

	} 

}
