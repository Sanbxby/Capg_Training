package AggregationAndComposition;

public class RoomDriver {
	public static void main(String[] args) {
		Room room = new Room(1600);
		System.out.println(room.getArea());
		
		
	House house=new House("red",room);
	System.out.println(house.getColor());
		
	HouseComposition hc= new HouseComposition("Blue",600);
	System.out.println(hc.getColor());
	System.out.println(hc.getRoom().getArea());
	
	hc=null;
	}

}
