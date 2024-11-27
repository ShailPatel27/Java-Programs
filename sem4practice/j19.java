//stringbuffer & stringbuilder
package sem4practice;

public class j19 {
    public static void main(String[] args) {
        StringBuffer sbr = new StringBuffer("Hello");
        StringBuilder sbl = new StringBuilder("World");

        System.out.println(sbr.append("abc"));
        System.out.println(sbl.append("qpr"));

        sbr.setCharAt(0, 'M');
        System.out.println(sbr);
        System.out.println(sbl.deleteCharAt(0));
    }
}
