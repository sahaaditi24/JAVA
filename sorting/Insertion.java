package sorting;

import java.util.Scanner;

public class Insertion{
    public static void insertionsort(int arr[], int n){
        for(int i=0; i<=n-1; i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;


                j--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        insertionsort(arr, n);
        System.out.println("Sorted array:");

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    
}
