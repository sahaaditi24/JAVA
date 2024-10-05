import java.util.Scanner;

public class Ratquestion {

    public static int solve(int r, int unit, int []arr, int n){
        if(arr == null){
            return -1;
        } 
        else {
            int r1 = r* unit;
            int sum = 0;
            int count = 0;
            for(int i=0; i<n; i++){
                sum = sum + arr[i];
                count++;
                if(sum>=r1){
                    break;
                }
            }
            if(sum < r1){
                return 0;
               
            }
            System.out.println("The count at which the food is sufficient is:");
            return count;
            
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = sc.nextInt();
        System.out.println("Enter no. of rats");
        int r = sc.nextInt();
        System.out.println("enter unit");
        int unit = sc.nextInt();
    
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();    
        }
        System.out.println(solve(r, unit, arr, n));
    
    }
    
}
