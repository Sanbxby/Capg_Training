package Methods;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int num=n;
	int rem=0;
	int s=0;
	while(n>0) {
		rem=n%10;
		s=s*10+rem;
		n=n/10;
	}
	if(s==num) {
		System.out.println("It is palindrome");
	}
	else
		System.out.println("IT IS NOT");
}
}
