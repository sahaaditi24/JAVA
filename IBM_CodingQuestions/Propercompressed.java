import java.util.*;

public class Propercompressed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        StringBuilder newstr = new StringBuilder();
        int l = str.length();
        int count = 0;
        for(int i=0; i<l; i+=2){
            char ch = str.charAt(i);
            count = str.charAt(i+1);
            newstr.append(ch).append(count);
            for(int j=0; j<newstr.length(); j+=2){
                if(str.charAt(i+2)!= newstr.charAt(j)){
                    
                }
            }

        }
    }
}
