interface Trackable { void track(); }
abstract class Delivery {
    abstract void deliver();
    void label() { System.out.println("Delivery label"); }
}
class Parcel extends Delivery implements Trackable {
    @Override void deliver() { System.out.println("Parcel delivered"); }
    @Override public void track() { System.out.println("Parcel tracked"); }
}
public class ServiceDemo {
    public static void main(String[] args) {
        Parcel p = new Parcel();
        p.label(); p.deliver(); p.track();
    }
}
