package Case_Study;

public class DomesticFlight extends Flight {
	
	private String StateCode;
	public DomesticFlight(String flightid, String departuretime, String arrivaltime, int availaibleseats) {
		super(flightid, departuretime, arrivaltime, availaibleseats);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bookseats() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isavailable() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getflightinfo() {
		// TODO Auto-generated method stub
		return "International Flight ["+ flightid +"]- State Code:" +StateCode;
	}
	@Override
	protected boolean bookSeats(int count) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

}
