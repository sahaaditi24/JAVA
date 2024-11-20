import java.util.*;

public class Dealership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of dealers");
        int n = sc.nextInt();
        int output =0;
        for(int i=0; i<n; i++){
            System.out.println("Enter no. cars");
            int C = sc.nextInt();
            System.out.println("Enter bikes");
            int b = sc.nextInt();
            output = C*4 + b*2;
            System.out.println(output);
        }
    }
}
