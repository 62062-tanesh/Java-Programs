import java.util.Scanner;

public class BitwiseNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        int result = ~n;
        System.out.println("The Result is: "+result);

    }
}
