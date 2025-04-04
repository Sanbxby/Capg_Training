package Methods;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int m=n;
		while(n>0) {
	    count+=1;
	    n=n/10;
		
		}
		int s=0;
		int w=m;
		int add=0;
		while(m>0) {
			add=(m%10);
			 s+=Math.pow(add, count);
			 m=m/10;

		
		}
		if(s==w) {
			System.out.println("It is");
			
		}
		else
			System.out.println("it is not");
		
		
	}

}
