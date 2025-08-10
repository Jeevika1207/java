package Abstract;
abstract class A {
    abstract void hello();
}


public class B  extends A{
    void hello(){
        System.out.println("B class is printing...");
    }
}
