public class Secondlargest {
    public static void main(String[] args) {
        int [] arr = {1,20,4,7,5,10};
        int largest = 1;
        int secondlargest = 2;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
                
            }
        }

        System.out.println(secondlargest);

    }
    
}
