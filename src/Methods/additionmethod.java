package Methods;

import java.util.Scanner;

public class additionmethod {
	public static void addition(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		addition(a,b);
	}

}
