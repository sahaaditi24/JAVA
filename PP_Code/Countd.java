import java.util.Scanner;

public class Countd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int digit = (int)(Math.log10(n)+1);
        System.out.println(digit);
    }
}
