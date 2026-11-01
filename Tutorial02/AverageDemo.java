import java.util.ArrayList;
public class AverageDemo {
    public static void main(String[] args) {
        ArrayList<Double> marks = new ArrayList<>();
        marks.add(70.0);
        marks.add(80.0);
        marks.add(90.0);
        if (marks.size() == 0) {
            System.out.println("List is empty");
        } else {
            double sum = 0;
            for (double m : marks) {
                sum += m;
            }
            System.out.println("Average: " + sum / marks.size());
        }
    }
}
