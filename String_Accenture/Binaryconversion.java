import java.util.Scanner;

public class Binaryconversion {

    public static void AND(String s1, String s2){
        int l = s1.length();
        String result = "";
       for(int i=0; i<l; i++){
            if(s1.charAt(i)=='1' && s2.charAt(i) == '1'){
                result += '1';
            }
            else{
                result += '0';
            }
       } 
       System.out.println(result);
    }

    public static void OR(String s1, String s2){
        int l = s1.length();
        String result = "";
       for(int i=0; i<l; i++){
            if(s1.charAt(i)=='1' || s2.charAt(i) == '1'){
                result +='1';
            }
            else{
                result += '0';
            }
       } 
       System.out.println(result);
    }

    public static void XOR(String s1, String s2){
        int l = s1.length();
        String result = "";
       for(int i=0; i<l; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                result += '0';
            }
            else{
                result += '1';
            }
       } 
       System.out.println(result);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st binary input");
        String s1 = sc.next();
        System.out.println("Enter 2nd binary input");
        String s2 = sc.next();
        AND(s1, s2);
        OR(s1, s2);
        XOR(s1,s2);

    }
}
