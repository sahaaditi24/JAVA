public class Palindrome {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("anna");
        StringBuilder s = new StringBuilder("anna");
        
        
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }
        System.out.println(sb);
        if(sb.compareTo(s)== 0){
            System.out.println("It's a palindrome string");
        }
        else{
            System.out.println("It's not a palindrome string");
        }
    }
    
}
