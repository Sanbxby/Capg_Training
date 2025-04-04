package Methods;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int nextterm=0;
		System.out.println(a+" " +b);
		for(int i=2;i<=n;i++) {
			a=b;
			b=nextterm;
			nextterm=a+b;
			System.out.println(nextterm);
		}
	}

}
