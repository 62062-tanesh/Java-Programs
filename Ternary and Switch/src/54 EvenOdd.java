import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        String result = n%2 == 0 ? "EVEN":"ODD";
        System.out.println("The Number is "+result);
    }
}
