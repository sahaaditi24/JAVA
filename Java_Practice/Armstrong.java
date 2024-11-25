import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();

        int n1 = n;
        int l = (int)(Math.log10(n)+1);
        int sum =0;
        while(n>0){
            int d = n % 10;
            sum += (int)(Math.pow(d, l));
            n = n/10;
        }
        if(sum == n1){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
