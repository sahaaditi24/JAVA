import java.util.*;

public class compriseletters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        StringBuilder newstr = new StringBuilder();
        int count =0;

        for(int i=0; i<str.length(); i++){
           if(str.charAt(i) == str.charAt(i+1)){
                count ++;
           }
           else{
                newstr.append(str.charAt(i));
                if(count> 1){
                    newstr.append(count);
                }
           } 
        }
    }
}
