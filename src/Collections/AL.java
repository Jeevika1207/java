package Collections;
import java.util.ArrayList;
public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(30);
        al.add(50);
        al.add(70);
        al.add(90);
        System.out.println("ArrayList: "+al);
        System.out.println("0th index value is "+al.get(0));
        al.remove(0);
        System.out.println("After removing 0th index"+al);
        al.set(0,5);
        System.out.println("Adding 0th index"+al);
        System.out.println("size of arraylist is "+al.size());

    }
}
