import java.util.ArrayList;
class Transport {
    String route;
    Transport(String route) { this.route = route; }
    void announce() { System.out.println("Transport on " + route); }
}
class Speedboat extends Transport {
    Speedboat(String route) { super(route); }
    @Override
    void announce() { System.out.println("Speedboat on " + route); }
}
class Ferry extends Transport {
    Ferry(String route) { super(route); }
    @Override
    void announce() { System.out.println("Ferry on " + route); }
}
public class TransportDemo {
    public static void main(String[] args) {
        Transport t = new Speedboat("North Line");
        t.announce();

        ArrayList<Transport> list = new ArrayList<>();
        list.add(new Speedboat("North Line"));
        list.add(new Ferry("South Line"));
        for (Transport x : list) {
            x.announce();
        }
    }
}
