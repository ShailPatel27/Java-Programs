//types of constructor
package sem4practice;

public class j14 {
    int a,b;

    j14(){  //default constructor
        a=10;
        b=20;
    }

    j14(int x, int y){ //parameterized constructor
        a = x;
        b = y;
    }

    j14(j14 obj){ //copy constructor
        a = obj.a;
        b = obj.b;
    }

    public void add(){
        System.out.println("Addition: " + (a+b));
    }

    public static void main(String[] args) {
        System.out.println("Default constructor");
        j14 j1 = new j14();
        j1.add();

        System.out.println("Parameterized constructor");
        j14 j2 = new j14(1,2);
        j2.add();

        System.out.println("Copy constructor");
        j14 j3 = new j14(j1); //copied j1
        j3.add();
    }
}
