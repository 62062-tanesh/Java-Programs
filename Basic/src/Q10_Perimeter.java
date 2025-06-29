import java.util.Scanner;

public class Q10_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The All Sides in Centimeters");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println("Perimeter of The Rectangle is: "+(a+b+c+d)+" cm");

    }
}
