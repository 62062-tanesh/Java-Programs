import java.util.Scanner;
public class StringIsPalindromOrNot {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(IsString1(str)){
            System.out.println("String is Palindrom.");
        }else{
            System.out.println("String is Not Palindrom.");
        }
    }
    public static boolean isString(String str){
        String org = str;
        char [] ch = str.toCharArray();
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            char temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
            i++;
            j--;
        }
        String ans = new String(ch);
        if(org.equals(ans)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean IsString1(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            else{
                return true;
            }
        }return true;
    }
}
