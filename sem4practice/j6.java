//labelled continue
package sem4practice;

public class j6 {
    public static void main(String[] args) {
        System.out.println("Brfore continue");

        c1:
            for(int i = 0; i < 5; i++){
                if(i==2){
                    continue c1;
                }
                System.out.println(i);
            }
    }
}
