//threads
package sem4practice;
class Thread1 implements Runnable {
    int i = 0;
    public void run(){
        while(i<=100)
        {
            System.out.println("first class");
            i++;
        }
    }
}
class Thread2 implements Runnable {
    int i = 0;
    public void run(){
        while(i<=100)
        {
            System.out.println("second class");
            i++;
        }
    }
}
public class j30 {
    public static void main(String[] args) {
        
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t2.start();
    }
}
