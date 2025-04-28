package Mock_Test;

public class InvalidRideException extends RuntimeException {
	static String message= "This ride is invalid";
	
	public  InvalidRideException(String message) {
		super(message);
	}
	
	
	
	

}
