import java.util.*;

public class Sumofsubarrays {

    public static void Sum(int N, int X, int[]a){
        int i=0; 
        int j= a.length-1;
        int count =0;

        while(i<=j){
            if(a[i] + a[j] < X){
                count += (j-i + 1);
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("The count of valid subarrays:"+ count);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of elements in array");
        int N = sc.nextInt();
        System.out.println("Enter the number to be compared with");
        int X = sc.nextInt();
        System.out.println("Enter the elements of array");
        int []a = new int[N];
        for(int i=0; i<N; i++){
           a[i] = sc.nextInt(); 
        }
        Sum(N, X, a);


    }
    
}
