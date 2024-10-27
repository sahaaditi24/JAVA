import java.util.Scanner;

public class Intersection {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elemets in 1st array");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int i=0; i<n1; i++){
           arr1[i] = sc.nextInt(); 
        }
        System.out.println("Enter the no. of elements in 2nd array");
        int n2 = sc.nextInt();
        int arr2[] = new int[n1];
        for(int i=0; i<n2; i++){
           arr2[i] = sc.nextInt(); 
        }

        int [] intersection = new int[n1];
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                if(arr1[i]== arr2[j]){
                    intersection[i] = arr1[i];
                }
            }
        }
        System.out.println("Element which are present in both arrays are:");
        for(int i=0; i<intersection.length; i++){
            
            System.out.println(intersection[i]);
        }

    }
    

}
