import java.util.Scanner;

class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n =  sc.nextInt();
        int result = n<0 ? -n : n;
        System.out.print("The Absolute Value is: "+result);

    }
}
