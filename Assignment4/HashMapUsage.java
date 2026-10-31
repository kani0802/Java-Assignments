import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapUsage {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("John", 85);
        students.put("Alice", 90);
        students.put("Bob", 78);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter student name to query: ");
            String name = scanner.nextLine().trim();

            Integer marks = students.get(name);
            if (marks != null) {
                System.out.println("Marks for " + name + ": " + marks);
            } else {
                System.out.println("Student not found: " + name);
            }
        }
    }
}
