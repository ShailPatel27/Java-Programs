package sem4;
import java.util.*;
public class j8labelledbreak {
    public static void main(String[] args) {
        
        int x = 10;
        
        b1:
        {
        for(int i=0; i<5; i++)
            {
                for(int j=0; j<=i; j++)
                {
                    System.out.print("* ");
                    break b1;
                }
                System.out.println("");
            }
        }
    }
}
