import java.util.Scanner;

public class Inversioncount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        } 
        int inversion = 0;
        for(int i=0; i<n-1 ; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]> arr[j]){
                    inversion++;
                }
            }
        }
        System.out.println("The output is " + inversion);

    }
    
}
