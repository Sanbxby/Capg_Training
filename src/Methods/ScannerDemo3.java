package Methods;

import java.util.Scanner;

public class ScannerDemo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number:");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter a sentence:");
				String s= sc.nextLine();
				System.out.println(a+" "+s);
	}
		
	}


