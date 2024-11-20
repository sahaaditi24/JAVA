import java.util.*;

public class Formula {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a");
       int a = sc.nextInt();
       System.out.println("Enter b");
       int b = sc.nextInt();
       System.out.println("Enter c");
       int c = sc.nextInt();

       int output = (int)(Math.pow(a,3)) + (int)(Math.pow(a,2)* b) + 2*(int)(Math.pow(a,2)*b)+ 2*a*(int)(Math.pow(b,2)) + a* (int)(Math.pow(b,2))+ (int)(Math.pow(b,3));
       System.out.println(output);
   } 
}
