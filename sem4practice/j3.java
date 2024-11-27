//switch case
package sem4practice;
import java.util.*;

public class j3 {
    public static void main(String[] args) {
        String day;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  mon or tue:");
        day = sc.nextLine();
        switch(day){
            case "mon":
            System.out.println("Today is monday");
            break;
            
            case "tue":
            System.out.println("Today is tuesday");
            break;

            default:
            System.out.println("Invalid Input");
            break;
        }
    }
}
