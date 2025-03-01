import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        int sum =0;
        int n1 = n;
        int l = (int)(Math.log10(n)+1);
        while (n>0){
            int arm = n%10;
            sum = sum + (int)(Math.pow(arm, l));
            n = n/10;
        }
        if(sum == n1){
            System.out.println("Armstrong no.");
        }
        else{
            System.out.println("Not armstrong no.");
        }


    }
}
