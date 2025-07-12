import java.util.Scanner;

public abstract class Shape {
    abstract void calculateArea();
}
class Circle extends Shape{
    float radius;
    Circle(float n){
        this.radius = n;
    }

    @Override
    void calculateArea() {
        System.out.println("The Area of The Circle is: "+(2*Math.PI*Math.pow(radius,2)));
    }
}
class Square extends Shape{
    float side;
    Square(float s){
        this.side = s;
    }
    void calculateArea(){
        System.out.println("The Area of The Square is: "+Math.pow(side,2));
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius of The Circle: ");
        float Radius = sc.nextFloat();
        Circle c = new Circle(Radius);
        c.calculateArea();
        System.out.print("Enter The Side of The Square: ");
        float side = sc.nextFloat();
        Square s = new Square(side);
        s.calculateArea();
    }
}