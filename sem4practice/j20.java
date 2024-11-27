//super
package sem4practice;

class abc{
    int a=10;
    int b=20;
    abc(){
        System.out.println("abc constructor called");
    }
    public void display(){
        System.out.print("Hello ");
    }
}
public class j20 extends abc{
    j20(){
        super();
        System.out.println("Called super class constructor");
    }
    public void display(){
        int a = 100;
        int b = 200;
        super.display();
        System.out.print("World!");
        System.out.println("Adding a from subclass and b from super class: " + (a+super.b));
    }
    public static void main(String[] args) {
        j20 j = new j20();
        j.display();
    }
}
