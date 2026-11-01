import java.util.Scanner;
public class MenuDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("3")) {
            System.out.println("1. Hello");
            System.out.println("2. Fares");
            System.out.println("3. Exit");
            choice = sc.nextLine();
            if (choice.equals("1")) {
                System.out.println("Hello!");
            } else if (choice.equals("2")) {
                System.out.println("LOCAL 20, EXPRESS 45, CARGO 65");
            } else if (!choice.equals("3")) {
                System.out.println("Invalid option");
            }
        }
        sc.close();
    }
}
