import java.util.Scanner;


public class Array_printelements{

    public static void main(String args[]){
        
        int marks [] = new int [10];
        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i< 3; i++){
            System.out.println("Enter elements");
            marks[i] = sc.nextInt();
        }
        for (int i=0 ; i< 3; i++){
            System.out.print(marks[i] + " ");


    }

}

}