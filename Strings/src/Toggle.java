import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0; i<str.length(); i++){
            char ch =  str.charAt(i);
            if(ch >= 65 && ch<=90){
                int ascii = (int)ch + 32;
                str.setCharAt(i,(char)ascii);
            }
            else if(ch >= 97 && ch <= 122){
                int ascii = (int)ch - 32;
                str.setCharAt(i,(char)ascii);
            }
            else{
                continue;
            }
        }

        System.out.println(str);
    }
}
