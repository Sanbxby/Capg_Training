package Case_Study;

public class Flight_Driver {
    public static void main(String[] args) {
        
        // Create an international flight
        InternationalFlights intlFlight = new InternationalFlights(
            "INT123", "10:00 AM", "4:00 PM", 2
        );
        
        // Create a domestic flight
        DomesticFlight domFlight = new DomesticFlight(
            "DOM456", "12:30 PM", "2:00 PM", 1
        );

        // Print initial flight info
        System.out.println("Initial Flight Information:");
        System.out.println(intlFlight.getFlightid());
        System.out.println(domFlight.getFlightid());
        System.out.println();

        // Attempt to book seats
        System.out.println("Booking Seats:");
        intlFlight.bookseats(); // should succeed
        intlFlight.bookseats(); // should succeed
        intlFlight.bookseats(); // should fail (0 seats left)
        
        domFlight.bookseats(); // should succeed
        domFlight.bookseats(); // should fail

        System.out.println();

        // Print updated flight info
        System.out.println("Updated Flight Information:");
        System.out.println(intlFlight.getFlightid());
        System.out.println(domFlight.getFlightid());
    }
}
