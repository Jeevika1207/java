package Collections;
import java.util.*;

public class Stacklist {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(30);
        s.push(50);
        s.push(70);
        s.push(90);
        System.out.println("Stack: "+s);
        s.pop();
        System.out.println("After removing 0th index"+s);
        System.out.println("peek element is "+s.peek());
        System.out.println("Searching for 70 is "+s.search(70));
        System.out.println("Empty or not "+s.empty());
    }
}
