import java.util.*;

public class Movingzerosatend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int pos = 0;
        for(int i=0; i<n ; i++){
            if(arr[i]!= 0){
                arr[pos] = arr[i];
                pos++;
            }
        }
        while(pos<n){
            arr[pos] = 0;
            pos++;
        }
        System.out.println("The new array is :");
        for(int i=0; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
}
