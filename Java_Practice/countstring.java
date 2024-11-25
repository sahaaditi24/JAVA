import java.util.*;

public class countstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        StringBuilder s1 = new StringBuilder();
        int l = str.length();
        int count= 1;

        for(int i=0; i<l; i++){
            if(i<l-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
            }
            else{
                s1.append(str.charAt(i));
                if(count>1){
                    s1.append(count);
                }
                count =1;
            }
            
            
        }
        System.err.println(s1);
    }
}
