import java.util.Scanner;

public class ToggleCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0; i<str.length(); i++){
            boolean flag = false;
            if(str.charAt(i) == ' ') continue;
            if(str.charAt(i)>=97) flag = true;
            if(flag){
                int ascii = (int)str.charAt(i);
                ascii -= 32;
                str.setCharAt(i,(char)ascii);
            }else{
                int ascii = (int)str.charAt(i);
                ascii += 32;
                str.setCharAt(i,(char)ascii);
            }
        }
        System.out.println(str);

    }
}
