package sem4;
import java.util.*;
public class j1oddeven {
    public void oddeven(int a){
        int x = a;

        if(x%2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
    public static void main(String args[]){
        int a;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        a = sc.nextInt();

        j1oddeven oe = new j1oddeven();
        oe.oddeven(a);
        
        sc.close();
    }
}
