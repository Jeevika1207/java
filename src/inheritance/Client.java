package inheritance;

public class Client {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.name("BMW");
        bmw.color("black");
        bmw.year(2005);
        bmw.speed();
        RR rr =new RR();
        rr.name("RR");
        rr.color("white");
        rr.year(2024);
        rr.speed();
    }


}
