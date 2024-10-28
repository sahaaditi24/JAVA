
public class Camelcasing {
    public static void main(String args[]){
        String str = "AditiIsInHighPressure";
        String [] result = str.split("(?=[A-Z])");

    for (String word: result){
        System.out.println(word);
    }

    }
    
}
