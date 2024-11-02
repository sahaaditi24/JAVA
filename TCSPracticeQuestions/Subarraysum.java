import java.util.*;

public class Subarraysum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the sum");
        int sum = sc.nextInt();
        int count = 0; 
        
        for(int i=0; i<n; i++){
            int subsum = 0;
            for(int j=i; j<n; j++){
                subsum += arr[j];
                if(subsum == sum){
                    count++;
                }

            }
        }
        System.out.println(count);

    }
}

