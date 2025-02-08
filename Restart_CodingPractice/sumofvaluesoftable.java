import java.util.Scanner;

public class sumofvaluesoftable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int T= sc.nextInt();
        int sum =0;  
        for(int i=1; i<11; i++){
            sum += T*i;
        }
        System.out.println(sum);
    }
}
