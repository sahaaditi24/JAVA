import java.util.Scanner;

public class Subarraytofindtarget {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target");
        int t = sc.nextInt();
        System.out.println("Enter the no. of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        int l = arr.length;
        for(int i=0; i<l; i++){
            sum = 0; 
            for(int j=i; j<l; j++){
                sum += arr[j];
                if(sum == t){
                    System.out.print("[ ");
                    for(int k=i; k<= j; k++){
                        System.out.print(arr[k] + " ");

                    }
                    System.out.println("]");
                }
            }
        }

    }
}
