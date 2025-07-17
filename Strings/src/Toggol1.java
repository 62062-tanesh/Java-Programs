import java.util.Scanner;
public class Toggol1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder str1 = new StringBuilder(str);
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch >= 65 && ch <= 90){
                int ascci = (int)ch;
                str1.setCharAt(i,(char)(ascci+32));
            }else if(ch >= 97 && ch <= 122){
                int ascci = (int)ch;
                str1.setCharAt(i,(char)(ascci-32));
            }else{
                continue;
            }
        }
        String str2 = str1.toString();
        System.out.println(str2);

    }
}
