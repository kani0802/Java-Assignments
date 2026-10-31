import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            queue.add(i);
        }

        System.out.println("Queue after enqueue: " + queue);
        queue.remove();
        System.out.println("After dequeue: " + queue);
    }
}
