public class Sortingarrays {
    public static void main(String[] args){
        int arr[] = {2,6,4,7,8,1,5};
        int n = arr.length;
        int temp =0;

        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                arr[i+1]= temp;
                arr[i] = arr[i+1];
                temp = arr[i];
            }
            

        }
        System.out.println("Sorted arrays");
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
        

    }
    
}
