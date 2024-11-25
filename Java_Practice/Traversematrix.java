import java.util.*;

public class Traversematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int row = sc.nextInt();
        System.out.println("Enter no. of columns");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];

        System.out.println("Enter values");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
