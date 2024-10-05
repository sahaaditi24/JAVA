import java.util.Scanner;

public class Averagenp {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = sc.nextInt();
        System.err.println("Enter the multiple of the times you want of the integer");
        int p = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=p; i++){
            sum = sum + n*i;

        }

        int output = (sum/p);
        System.out.println(output);
    }
   
}
