import java.util.Scanner;

public class SumofOddinarray {

    public static void SumofOdds(int arr[], int n){
        int Sum =0;
        for(int i=0; i<n; i++){
            if(arr[i]% 2 != 0){
                Sum = Sum + arr[i];
            }
        }
        System.out.println("The Sum of Odd no.'s is :" + Sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();       
        }
        SumofOdds(arr, n);

    }
    
}
