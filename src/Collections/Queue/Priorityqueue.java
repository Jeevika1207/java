package Collections.Queue;
import java.util.*;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(10);
        q.add(30);
        q.add(50);
        q.add(70);
        q.add(90);
        System.out.println("PriorityQueue: "+q);
        System.out.println("peek element is "+q.peek());
        System.out.println(" printing top element and removed in priority queue is "+q.poll());
        System.out.println("again peek element "+q.peek());
    }
}
