//throw
package sem4practice;

public class j24 {
    public static void main(String[] args) {
        int a=10, b=0, ans;

        if(b==0)
        throw new ArithmeticException("You Cannot Divide By Zero!!");

        ans = a/10;
        System.out.println(ans);
    }
}
