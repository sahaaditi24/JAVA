import java.util.Scanner;

public class Q1 {

    public static boolean prime(int m){
        if(m <= 1){
            return false;
        }
        for(int i=2; i<= Math.sqrt(m); i++){
            if(m % i == 0){
                return false;
            }     
        }
        return true;
    }

    public static boolean perfectsq(int m){
        int sqrt = (int) Math.sqrt(m);
        return (sqrt * sqrt == m);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int [] arr = new int[n];
 
        for(int i=1; i<=n; i++){
            if(prime(i)){
                arr[i-1]= (int) Math.pow(2,i-1);
            }
            else if(perfectsq(i)){
                arr[i-1] = (int) Math.pow(3,i-1);
            }
            else{
                if(i==1 || i==2){
                    arr[i-1]= 1;
                }
                else{
                    arr[i-1] = arr[i-2] + arr[i-3];
                }
                
            }
            
        }
        System.out.println("Resultant series:");
        for(int i=0; i<n ;i++){
            System.out.print(arr[i] + " ");
        }


    }
    
}
