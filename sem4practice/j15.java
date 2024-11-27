//random
package sem4practice;

import java.util.*;

public class j15 {
    public static void main(String[] args) {
        Random r1 = new Random();
        int a = r1.nextInt();
        System.out.println(a);

        System.out.println("---------------------------------");

        Random r2 = new Random();
        int b = r2.nextInt(100);
        System.out.println("Random number between 0 and 100: " + b);
    }   
}
