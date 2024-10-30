import java.util.*;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        int c1=0;
        int c2=0;
        for(int i=0; i<str.length(); i++){
           if(str.charAt(i) == '*'){
                c1++;
           } 
           else{
                c2++;
           }
        }
        if(c1>c2){
            System.out.println("Positive integer");
       }
       else if(c1<c2){
            System.out.println("Negative integer");
       }
       else{
            System.out.println(0);
       }
}
    }
    