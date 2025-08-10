package Keyword;

public class Keyword {
    static int staticVariable = 10;
    int a =8;
    final int finalVariable = 20;
    static void staticMethod() {
        System.out.println("This is a static method");
        System.out.println("Static variable: " + staticVariable);
        Keyword obj = new Keyword();
        System.out.println("The non static variable:"+obj.a);

    }
    void nonStaticMethod() {
        System.out.println("This is a non-static method");
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Final variable: " + finalVariable);
    }
    void finalMethod(){
        System.out.println("This is a final method ");
        System.out.println("Static Variable:"+staticVariable);
        System.out.println("Non Static Variable:"+a);
        System.out.println("Final Variable:"+finalVariable);
    }
    public static void main(String[] args) {
        Keyword obj = new Keyword();
        staticMethod();
        System.out.println("Static variable: " + Keyword.staticVariable);
        obj.nonStaticMethod();
        Keyword.staticVariable = 15;
        System.out.println("Modified static variable: " + Keyword.staticVariable);
        obj.finalMethod();
    }

}
