import java.util.Scanner;

public class Email {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an E-mail");
        String email = sc.next();
        String user = "";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                user += email.charAt(i);

            }
        }
        System.out.println(user);

    }
    
}
