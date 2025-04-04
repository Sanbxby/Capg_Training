package exception_Handling;

public class NullPointer {
	
	public static void ExceptionNull(){
		Object obj=null;
		try { 
			System.out.println(obj.toString());                         
		}
		catch(NullPointerException e2) {
			e2.printStackTrace();
			System.out.println(e2.getMessage());
		}
		
	}

	public static void main(String[] args) {
		ExceptionNull();
		// TODO Auto-generated method stub

	}

}
