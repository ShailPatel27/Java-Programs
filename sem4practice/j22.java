//divide by zero exception
package sem4practice;

public class j22 {
    public static void main(String[] args) throws ArithmeticException {
        try{
            int a = 10;
            System.out.println("A/0: " + a/0);
        }
        catch(ArithmeticException e){
            System.out.println("Arthmetic exception: " + e.getMessage());
        }
    }
}
