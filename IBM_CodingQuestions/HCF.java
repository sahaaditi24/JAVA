import java.util.*;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int m = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n = sc.nextInt();

        while(m!=n){
            if(m>n){
                m= m-n;
            }
            else{
                n= n-m;
            }
        }
        System.out.println("The HCF of 2 no.s is :" + m);
    }
}
