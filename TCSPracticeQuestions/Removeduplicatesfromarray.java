import java.util.*;

public class Removeduplicatesfromarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = sc.nextInt();
        String arr[] = new String[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        ArrayList<String> unique= new ArrayList<>();

        for(String elements: arr){
            if(!unique.contains(elements)){
                unique.add(elements);
            }
        }


        System.out.println("Array after removing the duplicates");
        for(String element: unique){
            System.out.println(element);
        }
    }
}
