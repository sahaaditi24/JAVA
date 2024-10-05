
import java.util.Scanner;

public class replaceE {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String res = sc.next();
        String result = "";
        
        
        for(int i=0; i<res.length(); i++){
            if(res.charAt(i)== 'e'){
                result += 'i';
            }
            else{
                result += res.charAt(i);
            }

        }
        System.out.println(result);
    }
    


    
}
