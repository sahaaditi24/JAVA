public class Matrix {
   public static void matrix(int A[][], int B[][]){
        
        int n = A.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                B[i][j] = A[j][i];
            }
        }
   } 
   public static void main(String[] args) {
       int A[][] = {{1,1,1,1},
                    {2,2,2,2},
                    {3,3,3,3},
                    {4,4,4,4}};
        int N = 4;

        int B[][] = new int[N][N];

        matrix(A, B);

        System.out.print("New matrix: \n" );
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(B[i][j] + " ");
                
            }
            System.out.print("\n");
        }
   }
}
