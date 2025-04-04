package Methods;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
	if(a>b && a>c ) {
		System.out.println("Largest is a");
	}
	else if(b>c && b>a ) {
		System.out.println("Largest is b");
	}
	else {
		System.out.println("Largest is c");
	}
		
	}

}
