package exception_Handling;

import java.util.Scanner;

public class AgeChecker {
	
	public static void elgibility(int age) {
		if (age>=21) {
			System.out.println("Eligible to get married");
		}else {
			throw new InvalidAge("Wait guys dont hurry");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		elgibility(age);
	}

}
