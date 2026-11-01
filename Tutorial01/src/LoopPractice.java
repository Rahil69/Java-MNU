public class LoopPractice {
    public static void main(String[] args) {
        for (int i = 2; i <= 8; i += 2) {
            System.out.println(i);
        }

        int n = 3;
        while (n >= 1) {
            System.out.println(n);
            n--;
        }

        int value = 8;
        do {
            System.out.println(value);
            value++;
        } while (value <= 5);

        int[] nums = {3, 6, 9};
        for (int x : nums) {
            System.out.println(x);
        }
    }
}
