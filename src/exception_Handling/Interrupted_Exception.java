package exception_Handling;

public class Interrupted_Exception {
	public static void printNumber() throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}

	}
	public static void Interrupted_Exception()  throws InterruptedException {
		printNumber();
	}
	public static void main(String[] args) throws InterruptedException {
		Interrupted_Exception();

	}


}
