import java.util.*;

public class Fibonacciseries {
    public static void series(int n){
        int n1 =0; 
        int n2 =1;
        for(int i=0; i<n; i++){
            System.out.println(n1 + "");
            int num3 = n1 + n2;
            n1 = n2; 
            n2 = num3;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        series(n);

    }
    
}
