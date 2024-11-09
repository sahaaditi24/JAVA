import java.util.*;

public class countandconverttostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        StringBuilder newstr = new StringBuilder();
        int l = str.length();
        for(int i=0; i<l-1; i+=2){
            char ch = str.charAt(i);
            int count = str.charAt(i+1)-'0';
            if(count > 0){
                for(int j=0; j<count; j++){
                    newstr.append(ch);
                }
            }
        }
        System.out.println("New string : " + newstr);

    }
}
