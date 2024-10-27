import java.util.*;


public class Anagram_Accenture {
    public static void checkanagram(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Yes it's an anagram");
        }
        else{
            System.out.println("No, it's not");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string");
        String str1 = sc.next();
        System.out.println("Enter the 2nd string");
        String str2 = sc.next();
        checkanagram(str1, str2);
    }
    
}
