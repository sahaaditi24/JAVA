import java.util.Scanner;

public class Edwardbirthday {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of cuts");
        int N = sc.nextInt();
        long pieces = 0;
        long m= 1000000007;

        if(N==1){
            pieces = 2;
        }

        pieces = ((N * (N+1))/2) + 1;
        
        pieces = pieces % m;
        System.out.println("No. of pieces is:" + pieces);
    }
}
