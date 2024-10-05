package sorting;

import java.util.*;

public class Mergesort {

    public static void merge(int arr[], int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low; 
        int right = mid + 1;
        while(left <= mid && right <=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;

            }

        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }

    }

    public static void ms(int arr[], int low, int high){
        if(low >= high) return;
        int mid = (low + high) /2;
        ms(arr, low, mid);
        ms(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void mergesort(int arr[], int n){
        ms(arr, 0, n-1);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ms(arr, 0, n-1);
        System.out.println();
        System.out.println("Sorted array:");

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    }
    

