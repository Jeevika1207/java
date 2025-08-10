package Interface;
interface Area{
   public void area();
}

public class Square  implements Area{
    public void area(){
        System.out.println("area of square is Side*Side");
    }
}
