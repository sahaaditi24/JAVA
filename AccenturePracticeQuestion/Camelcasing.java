import java.util.*;

public class Camelcasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();

        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }
            else{
                result.append(Character.toUpperCase(ch));
            }
        }
        System.out.println("Converted String:" + result.toString());

    }

}
    
