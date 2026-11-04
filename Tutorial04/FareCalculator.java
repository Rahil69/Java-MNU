public class FareCalculator {
    static int calculateFare(int passengers) {
        return passengers * 10;
    }
    static int calculateFare(int passengers, int rate) {
        return passengers * rate;
    }
    public static void main(String[] args) {
        System.out.println(calculateFare(3));
        System.out.println(calculateFare(3, 20));
    }
}
