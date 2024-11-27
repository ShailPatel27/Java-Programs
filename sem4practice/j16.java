//final
package sem4practice;

final class demo{
    final int a=10;
    //a=20(error)
    public void display(){
        System.out.println(a);
    }
}
public class j16{ //extends demo(error)
   public static void main(String[] args) {
        demo d = new demo();
        d.display();
   }
}
