import java.util.*;

public class Palindromeno {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no.");
    int n = sc.nextInt();
        int reversed = 0;
        while(n !=0){
            int digit = n% 10;
            reversed = reversed* 10 + digit;
            n = n/10;

        }
        if(reversed == n){
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("it's not a palindrome");
        }

   } 
}
