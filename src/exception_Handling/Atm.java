package exception_Handling;

import java.util.Scanner;

public class Atm {

	public static void CheckMoney(double money,int pin,int userpin) {

		if(money<0) {
			throw new InvalidMoney();
		}
		else if(pin!=userpin) {
			throw new Incorrectpin();
		}
		else {
			System.out.println("valid");
		}
	}
	public static void main(String[] args) {

		int userpin=1911;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		double money=sc.nextDouble();

		System.out.println("Enter the pin");
		int pin=sc.nextInt();

		CheckMoney(money,pin,userpin);



	}

}
