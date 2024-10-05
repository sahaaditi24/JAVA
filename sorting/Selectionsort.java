package sorting;

import java.util.*;

public class Selectionsort {
    
    public static void selection(int arr[], int n){
        
        for(int i=0; i<=(n-2); i++){
            int min =i;
            for(int j=i; j<=(n-1); j++){
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
        selection(arr, n);
        System.out.println("Sorted array:");

        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
       
}
