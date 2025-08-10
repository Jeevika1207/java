package Interface;

public class Circle implements Area {
    public void area(){
        System.out.println("arae of circle is 3.14*r*r");
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.area();
        Circle c = new Circle();
        c.area();
    }
}
