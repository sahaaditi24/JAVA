package sorting;

import java.util.Scanner;

public class Bubblesort {
    public static void Bubble(int arr[], int n){
        for(int i=(n-1); i>=0; i--){
            for(int j=0; j<=(i-1); j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }



    public static void main(String args[]){

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Bubble(arr, n);
        System.out.println("Sorted array:");

        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    
}
