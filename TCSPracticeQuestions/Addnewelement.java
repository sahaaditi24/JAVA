import java.util.*;

public class Addnewelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the new number");
        int num = sc.nextInt();
        int newarr[] = new int[n+1];

        for(int i=0; i<n; i++){
            newarr[i] = arr[i];
        }
        newarr[n] = num;

        System.out.println("The new arr is:");
        for(int i=0; i<newarr.length; i++){
            System.out.println(newarr[i]);
        }
    }
}
