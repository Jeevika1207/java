package Interface;
interface method{
    public default void add(int a,int b){
        sub(a,b);
        System.out.println(a+b);
    }
    private void sub(int a,int b){
        System.out.println(a-b);
    }
}

public class Add implements method {
    public static void main(String[] args) {
        Add a = new Add();
        a.add(8,3);
       // a.sub(8,3);
    }

}
