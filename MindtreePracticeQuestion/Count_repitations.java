import java.util.Scanner;

public class Count_repitations {
    public static void count(int array[], int t){
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]== t){
                count = count + 1;

            }

        }
        System.out.println(count);

    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements present in the array:");
        int n = sc.nextInt();

        int [] array = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the elements");
            array[i] = sc.nextInt();

        }

        System.out.println("Enter the target element");
        int t = sc.nextInt();
        count(array, t);


    }
    
}
