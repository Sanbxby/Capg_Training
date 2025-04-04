package array;

public class Missing_number {
	public static void missingarray(int arr[]) {
		int sum=0,newsum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			newsum+=i+1;


		}
		System.out.println("missing number ::"+(newsum-sum));
	}

public static void main(String[] args) {
		int arr[]= {9,6,4,2,3,5,7,0,1};
		missingarray(arr);


	}

}
