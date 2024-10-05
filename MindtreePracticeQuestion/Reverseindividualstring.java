import java.util.Scanner;

public class Reverseindividualstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the string");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for(String word : words){
            StringBuilder sb = new StringBuilder(word);

            for(int i=0; i<sb.length()/2; i++){
                int front =i;
                int back = sb.length()-1-i;

                char frontchar = sb.charAt(front);
                char backchar = sb.charAt(back);

                sb.setCharAt(front, backchar);
                sb.setCharAt(back, frontchar);

            }

            result.append(sb.toString()).append(" ");
        }

        System.err.println(result.toString().trim());

        


    }
    
}
