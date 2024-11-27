package sem4;
public class j2methodoverloading {
    public void add(int a, int b){
        int x = a;
        int y = b;
        System.out.println(x + " + " + y + " = " + (x+y));
    }

    public void add(int a, int b, int c, int d){
        int w = a;
        int x = b;
        int y = c;
        int z = d;
        System.out.println(w + " + " + x + " + " + y + " + " + z + " = " + (w+x+y+z));
    }
    public static void main(String args[]){
        j2methodoverloading j2 = new j2methodoverloading();
        j2.add(1,2);
        j2.add(10,20,30,40);
    }
}
