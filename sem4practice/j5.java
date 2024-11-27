//labelled break
package sem4practice;

public class j5 {
    public static void main(String[] args) {
        System.out.println("before break");
        break1:
        {
            for(int i = 0; i < 5; i++){
                System.out.println(i);
                break break1;
            }
            System.out.println("between break");
        } 
        System.out.println("After break");
    }
}
