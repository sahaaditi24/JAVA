import java.util.*;

public class dealership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of dealers");
        int n = sc.nextInt();
        int result= 0;
        for(int i=0; i<n; i++){
            System.out.println("Enter cars");
            int c = sc.nextInt();
            System.out.println("Enter bikes");
            int b = sc.nextInt();
            result = c*4 + b*2;
            System.out.println(result);

        }

    }
}
