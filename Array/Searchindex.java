import java.util.Scanner;


public class Searchindex {
    public static void main(String args[]){
        int num [] =new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element");
        for(int i=0; i<3; i++ ){
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the no.");
        int x = sc.nextInt();

        for (int i=1; i<3 ; i++){
            if(num[i] == x){
                System.out.println(i);

            }
        }
        

        
    }
}
