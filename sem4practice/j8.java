//overriding
package sem4practice;

class demo{
    public void display(int a){
        System.out.println("Demo class value: " + a);
    }
}
public class j8 extends demo {
    public void display(int a){
        System.out.println("Main class value: " + a);
    }

    public static void main(String[] args) {
        demo d = new demo();
        j8 j = new j8();

        d.display(10);
        j.display(20);
    }
}
