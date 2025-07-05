import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        int result = n << 4;
        System.out.println("The Result is: "+result);
    }
}
