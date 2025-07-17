import java.util.Scanner;
public class ReverseManualApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = Reverse(str);
        String str2 = Reverse1(str);
        System.out.println("with the first method: "+str1);
        System.out.println("with the Second method: "+str2);
    }

    public static String Reverse(String str){
        String str1 = "";
        for(int i=str.length()-1; i>=0;i--){
            char ch = str.charAt(i);
            str1 += ch;
        }
        return str1;
    }
    public static String Reverse1(String str){
        char [] ch =  str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j){
            char temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
            i++;
            j--;
        }
        String ans = new String(ch);
        return ans;
    }
}
