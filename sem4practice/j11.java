//linear search
package sem4practice;
import java.util.*;
public class j11 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int flag = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.println("Enter a[" + i + "] :");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search: ");
        int key = sc.nextInt();

        for(int i=0; i<a.length; i++){
            if(a[i] == key)
            {
                flag = 1;
                System.out.println("Element found at index " + (i));
                break;
            }  
        }
        if(flag != 1)
            System.out.println("Element not found");
    }
}
