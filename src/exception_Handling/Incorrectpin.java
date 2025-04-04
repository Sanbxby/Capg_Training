package exception_Handling;

public class Incorrectpin extends RuntimeException {
 static String message="Enter correct userpin";
	
		Incorrectpin(){
	      super(message);

}
}


