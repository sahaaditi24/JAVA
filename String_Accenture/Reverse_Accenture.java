import java.util.Scanner;

public class Reverse_Accenture {
    public static void main(String args[]){
        String rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.next();
        int l = s1.length();
        for(int i=l-1; i>=0; i--){
            rev = rev + s1.charAt(i);
        }
        System.out.println(rev);


    }
}