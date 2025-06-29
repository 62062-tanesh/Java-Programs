import java.util.Scanner;

public class Q8_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Numbre: ");
        int n2 = sc.nextInt();
        System.out.println("Sum of The Numbers: "+(n1+n2));
        System.out.println("Subtraction of The Numbers: "+(n1-n2));
        System.out.println("Multiplication of The Numbers: "+(n1*n2));
        System.out.println("Division of The Numbers: "+(n1/n2));
        System.out.println("The Remainder is: "+(n1%n2));
    }
}
