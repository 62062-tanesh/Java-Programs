import java.util.Scanner;

public class Q16_CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check The Number is Even Or Odd");
        System.out.println();
        System.out.print("Enter The Number You want to check: ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("The Number is Even.");
        }
        else{
            System.out.println("The Number is Odd.");
        }
    }
}
