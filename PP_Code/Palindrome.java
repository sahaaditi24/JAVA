import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int n = sc.nextInt();
       int n1 = n;
       int rev =0;
       while (n> 0){
            rev = rev * 10 + n% 10;
            n =n/10;
       }
       if(rev == n1){
            System.out.println("Palindrome");
       }
       else{
            System.out.println("not palindrome");
       }

    }
}
