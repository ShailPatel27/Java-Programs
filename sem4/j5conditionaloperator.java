package sem4;

public class j5conditionaloperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int x = (a>b)?a:b;
        System.out.println("Larger number is: " + x);

        String ans = (a<b)?"a is smaller than b":"a is larger than b";
        System.out.println(ans);

        System.out.println((a>b)?"b is smaller than a":"b is larger than a");
    }
}
