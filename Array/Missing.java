import java.util.Scanner;

public class Missing {
    public static void missingno(int n, int[]arr){
        for(int i=1; i<n; i++){
            if(arr[i]!= i){
                System.out.println(i);
            }
        
        }    

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements of array");
        for(int i=1; i<n; i++){
            arr[i] = sc.nextInt();
        }
        missingno(n, arr);
        

    }
    
}
