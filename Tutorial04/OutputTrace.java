class Base {
    String name = "Base";
    void show() { System.out.println("Base show"); }
}
class Derived extends Base {
    String name = "Derived";
    @Override
    void show() { System.out.println("Derived show"); }
}
public class OutputTrace {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
        System.out.println(b.name);
    }
}
