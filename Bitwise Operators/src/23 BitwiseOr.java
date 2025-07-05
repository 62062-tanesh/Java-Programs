import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int n2 = sc.nextInt();
        int result = n1|n2;
        System.out.println("The Operation with And is: "+result);
    }
}
