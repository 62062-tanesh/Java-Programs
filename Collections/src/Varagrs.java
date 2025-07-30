
public class Varagrs{
    public static void main(String[] args) {
        System.out.println(Concatenate("Tanesh","Tum","Kaha","Ho","Aur","Kaise","Ho."));
        System.out.println(Concatenate("Hey,","Tanesh","Whatsapp...."));
    }
    public static String Concatenate(String... str){
        StringBuilder result = new StringBuilder();
        for(String i : str){
            result.append(i).append(" ");
        }
        return result.toString();
    }
}
