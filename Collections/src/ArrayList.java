public class ArrayList {
    public static void main(String[] args){
        System.out.println(AddStrings("Tanesh","Tum","KahaHO"));
    }
    public static String AddStrings(String... str){
        String result = "";
        for(String i : str){
            result += i;
        }
        return result;
    }
}
