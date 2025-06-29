import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check Number is EVEN Or ODD\n");
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        if((n&1)==1){
            System.out.println("Number is ODD.");
        }
        else{
            System.out.println("Number is EVEN.");
        }
    }
}
