package OOPS;

public class Account {
	private String accountHolder;
	private double accountBalance;
	private long accountNumber;
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	private void withdraw(double accountBalance, double withdrawAmount) {
		if(accountBalance<0) {
			System.out.println("Negative number not allowed");
		}
		else if(accountBalance < withdrawAmount){
			System.out.println("Not possible,enter less amount");
		}
		else {
			accountBalance -= withdrawAmount;
			System.out.println("Withdraw Succesful");
			System.out.println("Current balance is" + accountBalance);
		}
	}
   private void deposit(double accountBalance, double depositAmount) {	
	   if(accountBalance<0) {
			System.out.println("Negative number not allowed");
	   }
	  else if(accountBalance < depositAmount)
		  System.out.println("Not possible,enter less amount");
	  else
	  {
		 accountBalance += depositAmount;
			System.out.println("Deposit Succesful");
			System.out.println("Current balance is" + accountBalance); 
	  }
	}

}
