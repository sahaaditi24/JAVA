import java.util.*;

public class Vowel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        int l = str.length();
        int c = 0;
        for(int i=0; i<l; i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u'){
                c++;
            }
            
        }
        System.out.println(c);
        
    }
}
