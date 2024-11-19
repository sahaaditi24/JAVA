import java.util.Scanner;

public class Sum_of_primefromarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no. of elements");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter no. of elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        int sum =0;
        for(int i=0; i<n-1; i++){
            for(int j=2; j<n; j++){
                if(arr[i] % j == 0){
                   count++; 
                }
                if(count == 0){
                    sum = sum + arr[i];
                }
            }
            
        }

        System.out.println(" The sum is:" + sum);
    }
}
