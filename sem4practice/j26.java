//abstract
package sem4practice;
abstract class d1{
    abstract public void hello();
}
abstract class d2 extends d1{
    public void hello(){
        System.out.println("Hello!");
    }
}
class d3 extends d1{
    public void hello(){
        System.out.println("Hello");
    }
}
public class j26 {
    public static void main(String[] args) {
        d3 d = new d3();
        d.hello();
    }
}
