import java.util.Scanner;

public class Q15_CheckTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println();
        System.out.println();
        System.out.println("Check whether the Number is Positive,Negative or Zero");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.print("Enter A Number: ");
        int N = sc.nextInt();
        if(N<0) {
            System.out.println(" it is Negative.");
        }
        else if(N==0){
            System.out.println("it is Zero.");
        }
        else{
            System.out.println("it is Positive.");
        }
    }
}
