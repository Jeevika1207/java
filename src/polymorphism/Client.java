package polymorphism;

public class Client {
    public static void main(String[] args) {
       // A a = new A();
        A a = new B();
        //a.print();
        System.out.println(a.name);
        System.out.println(a.n);
       // System.out.println(a.num);
        //System.out.println(a.var);
        //sum s = new sum();
       // s.add(5,6,8);
    }
}
