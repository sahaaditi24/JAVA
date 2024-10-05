import java.util.Scanner;

public class Fibonacci {
    public static int Fib(int n){
        if (n <= 1){
            return n;
        } 
        else{
            return Fib(n-1) + Fib(n-2);
        }
}



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        System.out.println(Fib(n));


    }
    
}
