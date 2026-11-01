import java.util.ArrayList;
public class WrapperDemo {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        int score = 74;
        scores.add(score);
        int x = scores.get(0);
        System.out.println(x);
    }
}
