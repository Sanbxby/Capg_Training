package Methods;

import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int sum=0;
				
				if(start>end) {
					int temp=start;
					start=end;
					end=temp;
				}
		
		for(int i=start;i<=end;i++) {
			if(i%2!=0) {
			sum+=i;
		}
		}
		System.out.println(sum);
		
	
	}
	
	
	

}

