import java.util.Scanner;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        StringBuilder sb  = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch !=' '){
                sb.append(ch);
            }else{
                sb.reverse();
                str1 += sb +" ";
                sb = new StringBuilder();
            }
        }
        sb.reverse();
        str1 += sb;
        System.out.println(str1);
    }
}
