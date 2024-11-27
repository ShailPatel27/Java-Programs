//basic file operations
package sem4practice;
import java.io.*;
import java.util.*;
import java.lang.*;
public class j25{
    public static void main(String[] args) throws IOException, InterruptedException {
        File f = new File("test.txt");
        f.createNewFile();

        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello World\nThis is my first file");
        fw.close();

        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();

        Thread.sleep(3000);

        if(f.delete()){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("Some error occurred");
        }
    }
}
