import java.util.*;

public class SpecialString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the no. of String");
        int n = sc.nextInt();
        boolean output = true;
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(i);
                for(int k=2; k<str.length(); k+=2){
                    if(ch == str.charAt(k) ){
                        output = true;
                    }
                    else{
                        output = false;
                    }
                }
                
            }
            if(output == true){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }

    }
    
}
