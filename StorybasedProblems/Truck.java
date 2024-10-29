import java.text.*;
import java.util.*;

public class Truck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");
        System.out.println("Enter fuel:");
        double fuel = sc.nextInt();
        System.out.println("Enter distance:");
        double distance = sc.nextInt();

        double consumption = (fuel/distance)* 100;
        double miles = distance * 0.6214;
        double gallons = fuel * 0.2642;

        double mg = (miles/ gallons);

        System.out.println(df2.format(consumption));
        System.out.println(df2.format(mg));

    }
    
    
    
}
