package sem4;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        // int arr[][] = new int[3][3];
        // int c = 1;

        // for(int i=0; i<=2; i++)
        // {
        //     for(int j=0; j<=2; j++)
        //     {
        //         arr[i][j] = c;
        //         c++;
        //     }
        // }

        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=2; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
