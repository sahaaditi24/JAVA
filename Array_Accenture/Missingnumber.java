import java.util.Scanner;

public class Missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements in array");
        int l = sc.nextInt();
        int n = l+1;
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<l; i++){
            arr[i] = sc.nextInt();
        }
        int arr_sum =0;
        int actual_sum =0;
        for(int i=0; i<l;i++){
            arr_sum += arr[i];
        }
        for(int i=1; i<=n;i++){
            actual_sum += i;
        }
        int diff = (actual_sum - arr_sum);
        System.out.println(diff);
    }
    
}
