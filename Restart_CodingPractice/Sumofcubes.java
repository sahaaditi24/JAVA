import java.util.Scanner;

public class Sumofcubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m");
        int m = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();
        int cube =0;

        for(int i=m; i<n+1; i++){
            cube += i*i*i;
        }
        System.out.println(cube);
    }
}
