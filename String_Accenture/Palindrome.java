import java.util.Scanner;

public class Palindrome {
    public static boolean ispalindrome(String str){
        boolean palindrome = false;
        String rev = "";
        int l = str.length();

        for(int i=l-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            palindrome = true;
        }
        else{
            palindrome = false;
        }
        return palindrome;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        System.out.println(ispalindrome(str));

    }
    
    
}
