import java.util.Scanner;

public class Countnoarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean counted[] = new boolean[n];

        int count =1; 
        for(int i=0; i<arr.length; i++){
            if(counted[i])continue;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i] == arr[j]){
                        counted[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + "occurs" + count + "times");
                count = 1;
            }
            
        }
    }

