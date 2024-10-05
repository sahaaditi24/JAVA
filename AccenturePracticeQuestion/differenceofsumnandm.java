import java.util.Scanner;

public class differenceofsumnandm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter m");
        int m = sc.nextInt();
        int sum_n = 0;
        int sum = 0;

        for(int i=1; i<=m; i++){
            if(i%n == 0){
                sum_n = sum_n + i;

            }
            else{
                sum = sum + i;
            }
        }

        int result = sum - sum_n;
        System.out.println(result);
        
    }
    
}
