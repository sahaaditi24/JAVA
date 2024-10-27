import java.util.Scanner;

public class Regions {
    public static void main(String args[]){
        System.out.println("Enter no. of lines");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int regions = 0;

        regions = ((N * (N+1)/ 2) + 1);
        System.out.println(regions);
    }
}
