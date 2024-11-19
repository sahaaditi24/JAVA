import java.util.Scanner;

public class Sum_of_primefromarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no. of elements");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter no. of elements in array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        int sum =0;

        for(int i=0; i<n; i++){
            if(isprime(arr[i])){
                sum = sum + arr[i];
            }
        }
        System.out.println("The sum is " + sum);

    }

    public static boolean isprime(int n){
        if(n<= 1){
            return false;
        }
        for(int i=2; i<n ; i++){
            if (n%i == 0){
                return false;
            }

        }
        return true;
    }
    
}
