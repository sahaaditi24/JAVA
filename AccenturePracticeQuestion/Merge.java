

public class Merge {
    public static void merge(int arr1[], int arr2[]){
        int i=0; 
        int j =0;
        int k=0;
        int l1 = arr1.length;
        int l2 = arr2.length;
        int merge[] = new int[l1+ l2];
        while(i<l1 && j< l2){
            if(arr1[i] < arr2[j]){
                merge[k++] = arr1[i]; 
                i++;
            }
            else{
                merge[k++]= arr2[j];
                j++;
            }

        }

        if( i< l1){
            merge[k++] = arr1[i];
        }
        else if(j<l2){
            merge[k++] = arr2[j];
        }
    }
}
