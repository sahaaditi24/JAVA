import java.util.Scanner;

public class Twodarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows = sc.nextInt();
        System.out.println("Enter columns");
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];

        System.out.println("Enter elements");

        for(int i=0; i<rows; i++){
            for(int j=0; j< cols; j++){
                arr[i][j] = sc.nextInt();
            }
            
        }
        System.out.println();
        System.out.println();

        for(int i=0; i<rows; i++){
            for(int j=0; j< cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("ENTER a no.");
        int x = sc.nextInt();


        for(int i=0; i<rows; i++){
            for(int j=0; j< cols; j++){
                if(arr[i][j] == x){
                    System.out.println("The index of the no. is "+ i  +" row " + j +" column ");
                }
        
        }
    }

        
    }
    
}
