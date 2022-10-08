import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> locationsQueue = new LinkedList<>();
        locationsQueue.add("Kolkata");
        locationsQueue.add("Bengaluru");
        locationsQueue.add("Chennai");
        locationsQueue.add("New Delhi");
        locationsQueue.add("Nagpur");
        System.out.println("Queue is: "+locationsQueue);
        System.out.println("Head of Queue: "+locationsQueue.peek());
        locationsQueue.remove();
        System.out.println("After removing Head of Queue: "+locationsQueue);
        System.out.println("Size of Queue: "+locationsQueue.size());

    }
}
