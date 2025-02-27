import java.util.Scanner;

public class Subarraytarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int t = sc.nextInt();

        int sum =0; 
        int left =0;
        boolean found = false;

        for(int right=0; right<arr.length; right++){
            sum += arr[right]; 

            while(sum > t & left < right){
                sum -= arr[left];
                left++;
            }

            if(sum == t){
                System.out.println("[" + (left+1) +","+ (right+1) + "]");
                found = true; 
                break;
            }
            
        }

        if (found = false){
            System.out.println("[-1]");
        }

    }
}
