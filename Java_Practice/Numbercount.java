import java.util.*;

public class Numbercount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean []visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(!visited[i]){
                int count =1;
                for(int j=i+1; j<n; j++){
                    if(arr[i]== arr[j]){
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i]+ "occurs" + count+ "times");
               

            }
            
        }
    }
}
