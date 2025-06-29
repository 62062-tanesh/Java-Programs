import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter The Value of B: ");
        int b = sc.nextInt();
        int c = 0;
//        c = a;
//        a = b;
//        b = c;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value of A is: "+a);
        System.out.println("Value of B is: "+b);
    }
}
