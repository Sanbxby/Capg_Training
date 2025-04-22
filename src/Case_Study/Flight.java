package Case_Study;

abstract class Flight {
	protected String flightid;
	private String departuretime;
	private String arrivaltime;
	private int availaibleseats;
	
	
	public Flight(String flightid, String departuretime, String arrivaltime, int availaibleseats) {
		super();
		this.flightid = flightid;
		this.departuretime = departuretime;
		this.arrivaltime = arrivaltime;
		this.availaibleseats = availaibleseats;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public int getAvailaibleseats() {
		return availaibleseats;
	}
	public void setAvailaibleseats(int availaibleseats) {
		this.availaibleseats = availaibleseats;
	}
	
	public abstract void bookseats();
	
	public  abstract boolean isavailable();
	
	public abstract String getflightinfo();
	protected abstract boolean bookSeats(int count);
	

}
