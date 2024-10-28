import java.util.*;

public class Reverseee {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        System.out.println("Enter the string");
        String str = sc.next();
        int l = str.length();
        for(int i=l-1; i>=0; i--){
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str1);
        sc.close();
   }
}
