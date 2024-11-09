import java.util.*;

public class checkduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter the no. of elements in the array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean result = false;

        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n;j++){
                if(arr[i] == arr[j]){
                    result = true;
                }
            }

        }
        System.out.println(result);
        

    }
}
