import java.util.Scanner;

public class Q9_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter The Second Number: ");
        double n2 = sc.nextDouble();
        double pro = n1*n2;
        System.out.println("The Product of The Numbers are: "+pro);
    }
}
