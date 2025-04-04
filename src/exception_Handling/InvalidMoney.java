package exception_Handling;

public class InvalidMoney extends RuntimeException {
 static String message="enter amount grater than 0";
	
	InvalidMoney(){
	      super(message);
}
}


