package Collections;
import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("b");
        l.addFirst("c");
        l.addFirst("a");
        System.out.println("the linked list is "+l);
        l.addLast("d");
        l.removeFirst();
        System.out.println("After removing first element "+l);
        l.removeLast();
        System.out.println("After removing last element "+l);
        System.out.println("Now the first element is "+l.getFirst());
        System.out.println("Now the last element is "+l.getLast());
        System.out.println("After modifying the list "+l);
    }

}
