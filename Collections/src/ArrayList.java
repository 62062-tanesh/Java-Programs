public class ArrayList {
    public static void main(String[] args){
        System.out.println(AddStrings("Tanesh","Tum","Kaha HO"));
    }
    public static String AddStrings(String... str){
        String result = "";
        for(String i : str){
            result += i;
            result += " ";
        }
        return result;
    }
}
