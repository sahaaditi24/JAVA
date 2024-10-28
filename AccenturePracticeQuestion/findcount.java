import java.util.*;

public class findcount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array:");
        int l = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[] = new int[l];
        for(int i=0; i<l; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Emter num:");
        int n = sc.nextInt();
        System.out.println("Emter diff:");
        int d = sc.nextInt();
        int c=0;
        for(int i=0; i<l; i++){
            if(Math.abs(n-arr[i]) <= d){
                c++;
            }
        }
        System.out.println(c);
    }
}
