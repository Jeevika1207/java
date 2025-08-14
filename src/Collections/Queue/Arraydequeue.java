package Collections.Queue;
import java.util.*;
public class Arraydequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        q.addFirst(10);
        q.addLast(30);
        q.add(50);
        q.add(70);
        q.addFirst(90);
        System.out.println("ArrayDeque: "+q);
        System.out.println("peek element is "+q.peekFirst());
        System.out.println("printing top element and removed in ArrayDeque is "+q.pollFirst());
        System.out.println("again peek element "+q.peekFirst());
    }
}
