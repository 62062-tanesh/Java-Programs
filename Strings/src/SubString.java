import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "Tanesh";
//        System.out.println(str.substring(3));
//        System.out.println(str.substring(0,6));
        String s = "Physcis";
        for(int j=2;j<4;j++){
            System.out.print(s.substring(j)+" ");
        }
    }
}
