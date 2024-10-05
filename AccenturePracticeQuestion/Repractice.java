import java.util.Scanner;

public class Repractice {
    public static int Operations(String str){
        if(str == null | str.length()==0){
            return -1;
        }
        if(str.length() % 2 == 0){
            return -1;
        }

        int result = str.charAt(0)- '0';

        for(int i=1; i<str.length(); i+=2){
            int operator = str.charAt(i);
            int nextdigit = str.charAt(i+1);

            if(operator == 'A'){
                result = result & nextdigit;
            }

            if(operator == 'B'){
                result = result | nextdigit;
            }
            if(operator == 'C'){
                result = result ^ nextdigit;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        System.out.println(Operations(str));

        
    }
    
}
