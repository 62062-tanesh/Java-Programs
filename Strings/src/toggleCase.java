import com.sun.source.tree.UsesTree;

import java.util.Scanner;

public class toggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0; i<str.length(); i++){
            boolean flag = false;
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            int ascii = (int)ch;
            if(ascii>=97){
                flag = true;
            }
            if(flag == true){
                ascii -= 32;
                str.setCharAt(i,(char)ascii);
            }else{
                ascii += 32;
                str.setCharAt(i,(char)ascii);
            }
        }
        System.out.println(str);
    }
}
