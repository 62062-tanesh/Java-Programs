package SimpleApplication.utils;

import SimpleApplication.geometry.Circle;
import SimpleApplication.geometry.Rectangle;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius: ");
        float a = sc.nextFloat();
        System.out.print("Enter The length of the Rectangle: ");
        float l = sc.nextFloat();
        System.out.print("Enter The breadth of the Rectangle: ");
        float b = sc.nextFloat();
        Circle cirle = new Circle(a);
        double area = cirle.AreaofCircle();
        System.out.printf("The Area Of The Circle Is: %f",area);
        Rectangle rect = new Rectangle(l,b);
        double area2 = rect.AreaOfRectangle();
        System.out.printf("\nThe Area Of The Rectangle Is: %f",area2);
    }
}
