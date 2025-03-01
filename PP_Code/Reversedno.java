import java.util.*;

public class Reversedno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        
        int rev =0;
        while (n>0){
            rev = rev*10 + n% 10;
            n = n/10;
        }
        System.out.println("reversed no is:" + rev);

    }
}
