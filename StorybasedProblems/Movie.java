import java.util.*;

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of pizza's");
        int pizza = sc.nextInt();
        System.out.println("Enter no. of puffs");
        int puffs = sc.nextInt();
        System.out.println("Enter no. of cold drinks");
        int drinks = sc.nextInt();
        int price = 0;

        price = pizza * 100 + puffs * 20 + drinks * 10;
        System.out.println(price);

    }
    
}
