import java.util.*;

public class Removehash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str");
        String str = sc.next();
        StringBuilder hash = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '#'){
                hash.append(str.charAt(i));
            }
            else{
                letters.append(str.charAt(i));
            }
        }
        System.out.println(letters.toString());



    }
}
