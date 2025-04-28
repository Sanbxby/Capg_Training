package Mock_Test;

public class Driver extends User {
	
	
	private boolean Available=true;
	
	public Driver(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}


	@Override
	void showProfile() {
		
		System.out.println("Driver name: "+this.getName()+"Availability status: " + isAvailable());
		// TODO Auto-generated method stub
		
	}
	
	public boolean isAvailable() {
		if(Available==true) {
			return true;
		}
		else {
			return false;
		}
	}
	public void setAvailable(boolean Available) {
		this.Available=Available
				;
		return;
	}

}
