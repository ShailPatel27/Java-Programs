//arraylist
package sem4practice;

import java.util.*;

public class j21 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println("Elements of ArrayList:" + a);
        System.out.print("Adding an element in between: ");
        a.add(4,45);
        System.out.println(a);

        System.out.println("Array size is: " + a.size());
    }
}
