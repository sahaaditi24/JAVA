package sorting;
import java.util.Scanner;


public class Quicksort {

    public static int partition(int arr[], int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i] <= pivot && i <= high-1){
                i++;
            }

            while(arr[j] > pivot && j >= low + 1){
                j--;
            }
            if(i<j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

            int temp1 = arr[j];
            arr[j]= arr[low];
            arr[low] = temp1;
    
        }
        return j;
    }
    
    public static void qs(int arr[], int low, int high){
        if(low < high){
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex-1);
            qs(arr, pIndex + 1, high);
        }
    }
    
    public static void quicksort(int arr[], int n){
        qs(arr, 0, n-1);
        
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        qs(arr, 0, n-1);
        System.out.println();
        System.out.println("Sorted array:");

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}
