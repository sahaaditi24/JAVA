import java.util.*;

public class TwoSum {

    public static String Sum(int arr[], int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        Arrays.sort(arr);
        while(left < right){
            int Sum = arr[left] + arr[right];
            if(Sum == target){
                return "Yes";
            }
            else if(Sum < target){
                left++;
            }
            else{
                right--;
            }

        }
        return "NO";


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Enter target:");
        int target = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Sum(arr, target));

        

    }
    
}
