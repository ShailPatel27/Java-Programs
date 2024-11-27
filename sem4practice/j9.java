//single dimensional array & sorting
package sem4practice;

import java.util.*;

public class j9 {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("--------------------------------");

        int b[] = {1,3,4,5,2};
        
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }

        System.out.println("Sorted array:");

        Arrays.sort(b);
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }    
}
