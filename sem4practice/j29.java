//inner and outer classes
package sem4practice;

class outer{
    int a = 10;
    class inner{
        int b = 20;
        public void displayinner(){
            System.out.println("Outer: " + a);
            System.out.println("Inner: " + b);
        }
    }
    public void displayouter(){
        System.out.println("Outer: " + a);
        // System.out.println("Inner: " + b);
    }
}
public class j29 {
    public static void main(String[] args) {
        outer o = new outer();
        outer.inner i = o.new inner();
        i.displayinner();
        o.displayouter();
    }       
}
