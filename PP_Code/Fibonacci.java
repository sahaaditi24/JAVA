import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. upto which u want the f series");
        int n = sc.nextInt();
        int a =0;
        int b =1;
        System.out.println("Fibonacci Series:");
        for(int i=0; i<n; i++){
            System.out.print(a + " "); 
            int num3 = a + b;
            a =b;
            b = num3;
           
        }
        
    }
}
