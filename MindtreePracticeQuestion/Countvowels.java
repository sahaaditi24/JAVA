import java.util.Scanner;


public class Countvowels {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        int vowel = 0;
        for(int i=0; i<sb.length(); i++){
            char l =sb.charAt(i);
            if( l == 'a' || l == 'e' || l == 'i' || l == 'o' || l=='u' ||
                l=='A' || l == 'E' || l == 'I' || l == 'O' || l=='U'){
                    vowel = vowel + 1;
                }
            
        }
        System.out.println(vowel);

    }
    
}
