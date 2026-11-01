import java.util.ArrayList;
public class CollectionPractice {
    public static void main(String[] args) {
        int[] temperatures = {29, 30, 28};
        ArrayList<Integer> readings = new ArrayList<>();
        readings.add(29);
        readings.add(30);
        readings.add(28);
        readings.set(0, 31);
        readings.remove(2);
        System.out.println("Array length: " + temperatures.length);
        System.out.println("List size: " + readings.size());
        System.out.println("Readings: " + readings);

        String[] names = {"Amy", "Ben", "Cara", "Dan"};
        System.out.println(names[3]);

        ArrayList<String> list = new ArrayList<>();
        list.add("Amy");
        list.add("Ben");
        list.set(0, "Zoe");
        list.remove(1);
        System.out.println(list);
    }
}
