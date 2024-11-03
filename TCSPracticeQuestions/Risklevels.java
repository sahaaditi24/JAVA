import java.util.*;

public class Risklevels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = sc.nextInt();
        int temp =0;
        int risk[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            risk[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(risk[j] > risk[j+1]){
                    temp = risk[j];
                    risk[j] = risk[j+1];
                    risk[j+1]= temp;
                }
                
            }
        }
        System.out.println("The risk levels are:");
        for(int i=0; i<n; i++){
            System.out.println(risk[i]);

        }

    }
}
