package String;

public class SumArray {
	
	public static void SumArray(int arr[]) {
		int count=0;
		int[] arr2=new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			count+=arr[i];
			arr2[i]=count;
			
			
		}
		for(int i:arr2) {
			System.out.print(i+" ");
		}
	}

	
	
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	int[]arr= {1,2,3,4};
	SumArray(arr);

	}

}
