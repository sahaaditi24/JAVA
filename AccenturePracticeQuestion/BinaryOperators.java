import java.util.Scanner;

public class BinaryOperators {
    public static int Binary(String str){
        if(str == null || str.length() == 0){
            return -1;
        }

        if (str.length() % 2 ==0){
            return -1;
        }

        int result = str.charAt(0) - '0';

        for(int i=1; i<str.length(); i+=2){
            char operator = str.charAt(i);
            int nextdigit = str.charAt(i+1)-'0';

            if(operator == 'A'){
                result = result & nextdigit;
            }
            else if(operator == 'B'){
                result = result | nextdigit;
            }
            else if( operator == 'C'){
                result = result ^ nextdigit;
            }

        }

        return result;       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.next();
        System.out.println(Binary(string));
        
    }
    
}
