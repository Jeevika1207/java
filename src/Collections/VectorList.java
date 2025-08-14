package Collections;
import java.util.*;
public class VectorList {
    public static void main(String[] args) {
        Vector<Integer>v = new Vector<Integer>();
        v.add(10);
        v.add(30);
        v.add(50);
        v.add(70);
        v.add(90);
        System.out.println("Vector: "+v);
        v.remove(0);
        System.out.println("After removing 0th index"+v);
        v.set(0,5);
        System.out.println("Adding 0th index"+v);
        System.out.println("size of vector is "+v.size());
    }

}
