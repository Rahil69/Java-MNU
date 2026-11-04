class Register {
    private int capacity = 12;
    public int getCapacity() { return capacity; }
}
public class VisibilityPractice {
    public static void main(String[] args) {
        Register r = new Register();
        System.out.println("Capacity: " + r.getCapacity());
    }
}
