package sem4;
import java.util.*;

class student2{
    int RollNo;
    String Name, Branch;

    public void getdata2(){


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter RollNo: ");
        RollNo = sc.nextInt();

        System.out.print("Enter Name: ");
        Name = sc.next();

        System.out.print("Enter Branch: ");
        Branch = sc.next();
    }

    public void rollnoexception2(){
        try {
            if(RollNo<80 || RollNo>0){
                System.out.println(RollNo + "\n" + Name + "\n" + Branch);
            }
            else{
                throw new InvalidRollNo2("Please enter a valid roll no");
            }
        }
        catch (InvalidRollNo2 e) {
                System.out.println(e.getMessage());
                // e.printStackTrace();
        }
    }
}

class InvalidRollNo2 extends Exception{
    InvalidRollNo2(String e){
        super(e);
    }
}
public class j9_2userdefinedexception {
    public static void main(String[] args) {
        student2 s = new student2();
        s.getdata2();
        s.rollnoexception2();
        // i.rollnoexception2();
    }
}

