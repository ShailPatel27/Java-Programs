//overloading
package sem4practice;

public class j7 {
    public void display(int a)
    {
        System.out.println("first method: " + a);
    }
    public void display(int a, int b)
    {
        System.out.println("second method: " + a + "," + b);
    }
    public static void main(String[] args) {
        j7 j = new j7();
        j.display(10);
        j.display(10, 20);
    }
}
