package array;

public class Maximum2D {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
		int max = arr[0][0];
		int a = 0, b = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					a = i;
					b = j;
				}

			}
		}
		System.out.println("Maximum is " + max);
		System.out.println(a + " " + b);
	}

}
