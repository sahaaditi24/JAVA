import java.util.*;

public class Greaterthanprior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. elements in array:"); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count =1;
        System.out.println("Enter elements of array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1; i<n; i++){
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        System.out.println("The count is ="+count);

    }
}
