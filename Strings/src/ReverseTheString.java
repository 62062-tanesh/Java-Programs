import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Reverse(str);
        String s1 = sc.nextLine();
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }
        System.out.println(s2);


    }

    public static void Reverse(String str){
        StringBuilder str1 = new StringBuilder(str);
        int i=0;
        int j=str.length()-1;
        while(i<j){
            char temp = str1.charAt(i);
            str1.setCharAt(i,str1.charAt(j));
            str1.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(str1);
    }
}
