
import java.util.*;

public class LargeSmallSum {
    public static int largesmallsum(int[] arr){
        int sum=0;
        int l = arr.length;
        ArrayList <Integer> even = new ArrayList <Integer> ();
        ArrayList <Integer> odd = new ArrayList <Integer> ();
        for(int i=0; i<l;i++ ){
            if(i% 2== 0){
              even.add(arr[i]);  
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        sum = even.get(even.size()-2) + odd.get(1);
        return sum;

    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements of array:");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of odd second smallest and even second largest "+largesmallsum(arr));
    }
    
    
}
