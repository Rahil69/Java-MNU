class Passenger {
    private final String name;
    Passenger(String name) { this.name = name; }
    String getName() { return name; }
}
class Booking {
    private final Passenger passenger;
    private final int seats;
    Booking(Passenger passenger, int seats) {
        this.passenger = passenger; this.seats = seats;
    }
    String describe() {
    return passenger.getName() + " has booked " + seats + " seat(s).";
}
}
public class BookingDemo {
    public static void main(String[] args) {
        Passenger p = new Passenger("Aisha");
        Booking b = new Booking(p, 2);
        System.out.println(b.describe());
    }
}
