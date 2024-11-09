import java.util.*;

public class Stringcount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        int l = str.length();
        StringBuilder newstr = new StringBuilder();
        int count =1;

        for(int i=0; i<l; i++){
            if(i<l-1 && str.charAt(i)== str.charAt(i+1)){
                count++;  
            }
            else{
                newstr.append(str.charAt(i));
                if(count> 1){
                    newstr.append(count);
                }
                count =1;
            }
        }


    }
}
