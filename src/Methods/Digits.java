package Methods;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		int temp=n;
		while(temp!=0) {
			count++;
			temp=temp/10;
		}
		System.out.println(count);
	}
	
	

	}


