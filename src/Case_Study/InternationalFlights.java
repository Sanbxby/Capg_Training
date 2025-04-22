package Case_Study;

public class InternationalFlights extends Flight {
	
	private String CountryCode;

	public InternationalFlights(String flightid, String departuretime, String arrivaltime, int availaibleseats) {
		super(flightid, departuretime, arrivaltime, availaibleseats);
		
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getflightinfo() {
         return "International Flight ["+ flightid +"]- Country Code:" +CountryCode;

	}


	@Override
	public void bookseats() {
		if (isavailable()) {
			setAvailableSeats(getAvailableSeats() - 1);
			System.out.println("Seat booked on domestic flight " + getFlightid());
		} else {
			System.out.println("No seats available on domestic flight " + getFlightid());
		}
	
		// TODO Auto-generated method stub
		
	}




	private void setAvailableSeats(int i) {
		// TODO Auto-generated method stub
		
	}


	private int getAvailableSeats() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isavailable() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	protected boolean bookSeats(int count) {
		// TODO Auto-generated method stub
		return false;
	}

}
