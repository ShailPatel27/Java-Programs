//passing array as method arguments
package sem4practice;

public class j10 {
    public void mul(int[] a){
        for(int i=0; i<a.length; i++){
            a[i] = a[i] * 10;
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5};

        j10 j = new j10();
        j.mul(a);
    }
}
