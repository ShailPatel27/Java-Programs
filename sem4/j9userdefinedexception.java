package sem4;
import java.util.Scanner;

class Student {
    int RollNo;
    String Name, Branch;
    Scanner sc = new Scanner(System.in);

    public void getData() {
        System.out.print("Enter RollNo: ");
        RollNo = sc.nextInt();

        System.out.print("Enter Name: ");
        Name = sc.next();

        System.out.print("Enter Branch: ");
        Branch = sc.next();
    }

    public void validateRollNo() throws InvalidRollNo {
        if (RollNo < 1 || RollNo > 80) {
            throw new InvalidRollNo("Please enter a valid rollno(between 1 and 80)");
        }
    }
}

class InvalidRollNo extends Exception {
    InvalidRollNo(String s) {
        super(s);
    }
}

public class j9userdefinedexception {
    public static void main(String[] args) {
        Student s = new Student();
        s.getData();

        try {
            s.validateRollNo();
            System.out.println("Student Details:");
            System.out.println("Roll Number: " + s.RollNo);
            System.out.println("Name: " + s.Name);
            System.out.println("Branch: " + s.Branch);
        } 
        catch (InvalidRollNo e) {
            e.printStackTrace();
        }
    }
}
