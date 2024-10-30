import java.util.*;

public class Magicboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        char p = (char) a;
        char q = (char) b;
        char r = (char) c;
        char s = (char) d;

        System.out.println(a-p);
        System.out.println(b-q);
        System.out.println(c-r);
        System.out.println(d-s);
    }
    
}
