
public class Replacevowels {
    public static void main(String[] args) {
        
        String str = "peoplepeoplepeople";
        
        String newstr = str.replaceAll("ple", "ly");
        System.out.println(newstr);
    }
}
