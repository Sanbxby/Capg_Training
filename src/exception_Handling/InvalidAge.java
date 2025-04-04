package exception_Handling;

public class InvalidAge extends RuntimeException {

	
	private static String message="Age is invalid";
	
	InvalidAge(){
	      super(message);
}
public InvalidAge(String message) {
	super(message);
}
}
