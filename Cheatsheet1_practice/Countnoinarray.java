import java.util.*;

public class Countnoinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 1;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
                
            }
            System.out.println(arr[i] + "occurs" + count + "Times");
            count = 1;
        }
    }
}
