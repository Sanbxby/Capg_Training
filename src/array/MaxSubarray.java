package array;

public class MaxSubarray {
	
	public static void subarraysum(int arr[]) {
		int maxsum=Integer.MIN_VALUE;
		int cursum=0;
		
		
		for(int num:arr) {
			cursum+=num;
			maxsum = Math.max(maxsum, cursum);
			
			
			if(cursum <0) {
				cursum=0;
			}
		}
		System.out.println(maxsum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {-2,1,-3,4,-1,2,1,-5,4};     
     subarraysum(arr);
     
	}

}
