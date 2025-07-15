import java.util.Scanner;

public class PrintAllSubstringOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Word: ");
        String s = sc.next();
        int length = s.length();
//        System.out.println(length);
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length+1;j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
