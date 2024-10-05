import java.util.Scanner;

public class Q2Wheels {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Wheels");
        int w = sc.nextInt();
        System.out.println("Enter no.of vehicles");
        int v = sc.nextInt();
        int TW = 0;
        int FW =0;

        if(w>v && w%2==0 && w>=2){
            TW = ((4*v-w)/2);
            FW = (v- TW);
        }
        else{
            System.out.println("Invalid input");
        }
        System.out.println("The no. of two wheelers are:"+ TW);
        System.out.println("The no. of four wheelers are:"+ FW);
        
    }
    
}
