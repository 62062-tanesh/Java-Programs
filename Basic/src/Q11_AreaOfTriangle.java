import java.util.Scanner;

public class Q11_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The Base of The Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter The Height of The Triangle: ");
        double height = sc.nextDouble();
        double area = (base*height)/2;
        System.out.println("The Area of Triangle is: "+area);
    }
}
