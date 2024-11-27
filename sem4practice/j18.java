//String functions
package sem4practice;

public class j18 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        System.out.println("concating: " + s1.concat(s2));

        System.out.println("Converting s1 to uppercase: " + s1.toUpperCase());

        System.out.println("Character at index 1 of string s1: " + s1.charAt(1));

        if(s1.equals(s2)){
            System.out.println("both strings are equal");
        }
        else{
            System.out.println("both strings are not equal");
        }
    }
}
