import java.util.*;

public class Countintegers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 1;
        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + "occurs" + count + "times");
            count = 1;
        }
    }
}
