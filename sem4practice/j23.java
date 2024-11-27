//nested try
package sem4practice;
import java.util.*;
public class j23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("A: ");
            String x = sc.nextLine();
            int a = Integer.parseInt(x);

            System.out.print("B: ");
            String y = sc.nextLine();
            int b = Integer.parseInt(y);
            try{
                int ans = a/b;
                System.out.println("A/B = " + ans);
            }
            catch(ArithmeticException ae){
                System.out.println("Exception : " + ae.getMessage());
            }
        }
        catch(NumberFormatException ne){
            System.out.println("Exception : " + ne.getMessage());
        }
    }
}
