import java.util.*;

public class Countdigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = (int)(Math.log10(n)+1);
        System.out.println(count);
    }
}


// int count = (int)(Math.log10(n)+ 1);