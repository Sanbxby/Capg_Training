package OOPS;

public class New_ATM {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(10000).deposit(5000).withdraw(2000).deposit(5000).checkBalance();
	}

}
