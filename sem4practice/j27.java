//interface
package sem4practice;
interface inter{
    int a = 10;
    int b = 20;
    public void add();
}
public class j27 implements inter{
    public void add(){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        j27 j = new j27();
        j.add();
    }
}
