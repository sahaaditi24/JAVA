import java.util.*;

public class sumofelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("The sum is" + sum);
    }
}
 