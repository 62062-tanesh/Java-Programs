import java.util.Scanner;
public class SubstringsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "TANESH";
        for(int i=0 ; i<str.length(); i++){
            for(int j= i+1; j<str.length()+1; j++){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }

}
