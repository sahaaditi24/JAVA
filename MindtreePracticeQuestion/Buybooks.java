import java.util.Scanner;

public class Buybooks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of books u want to buy");
        int n = sc.nextInt();
        int[] earnarray = new int[n];
        int[] costarray = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        int borrow = 0;

        for(int i=0; i<earnarray.length; i++){
            System.out.println("Enter the amount earned for each book");
            earnarray[i] = sc.nextInt();

        }


        for(int i=0; i<costarray.length; i++){
            System.out.println("Enter the cost of each book");
            costarray[i] = sc.nextInt();
        }

        for(int i=0; i<earnarray.length; i++){
            sum1 = sum1 + earnarray[i];
        }

        for(int i=0; i<costarray.length; i++){
            sum2 = sum2 + costarray[i];
        }

        borrow = Math.abs(sum1 - sum2);
        System.out.println("Amount of money to be borrowed from parents is :"+borrow);

    }
    
}
