package exception_Handling;
import java.lang.Exception;

public class IndexOutOfBound {
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		try {
			System.out.println(arr[10]);
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error is in control");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}

}
