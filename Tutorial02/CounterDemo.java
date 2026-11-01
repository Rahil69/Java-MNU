class Visitor {
    static int total = 0;
    int number;
    Visitor() {
        total++;
        number = total;
    }
}
public class CounterDemo {
    public static void main(String[] args) {
        Visitor a = new Visitor();
        Visitor b = new Visitor();
        System.out.println("A=" + a.number + ", total=" + Visitor.total);
        System.out.println("B=" + b.number + ", total=" + Visitor.total);
    }
}
