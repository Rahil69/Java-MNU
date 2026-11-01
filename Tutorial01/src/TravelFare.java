import java.util.Scanner;
public class TravelFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Trip (LOCAL/EXPRESS/CARGO): ");
        String text = sc.nextLine().toUpperCase();
        switch (text) {
            case "LOCAL": System.out.println("Fare: 20"); break;
            case "EXPRESS": System.out.println("Fare: 45"); break;
            case "CARGO": System.out.println("Fare: 65"); break;
            default: System.out.println("Unknown trip");
        }
    }
}