import java.util.Scanner;
public class ReversewithStringBuilder {
    public static void main(String []  args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = ReverseString(str);
        System.out.println(ans);
    }
    public static String ReverseString(String str){
        StringBuilder str1 = new StringBuilder(str);
        int i = 0;
        int j = str1.length()-1;
        while(i<j){
            char temp = str1.charAt(j);
            str1.setCharAt(j,str.charAt(i));
            str1.setCharAt(i,temp);
            i++;
            j--;
        }
        String str3 = str1.toString();
        return str3;
    }

}
