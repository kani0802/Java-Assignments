import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate value is ignored.
        numbers.add(40);

        // TreeSet is used only to make the displayed order predictable.
        System.out.println("HashSet: " + new TreeSet<>(numbers));
    }
}
