import java.util.*;

public class Findmissingelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Enter elements of array");
        for(int i=0; i<l; i++){
            arr[i] = sc.nextInt();
        }
        int max= arr[0];

        for(int i=1; i<l; i++){
            if(max < arr[i]){
                max= arr[i];
            }
        }
        int temp = 0;
        for(int i=0; i<l-1; i++){
            for(int j=0; j<l-i-1; j++){
                if(arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        int output = 0;
        for(int i=0;i<max; i++){
            if(arr[i]!= i+1){
                output = i+1;
            }
        }
        System.out.println("The missing no. is "+output);

    }
}
