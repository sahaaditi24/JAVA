import java.util.*;

public class Binarysearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the number of elements in array:");
        int l = sc.nextInt();
        int arr[] = new int[l];
        for(int i=0; i<l; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0; 
        int right = l-1;
        int mid = (left + right)/2;

        if(arr[mid] == n){
            System.out.println(mid);
        }
        
    }
     
}
