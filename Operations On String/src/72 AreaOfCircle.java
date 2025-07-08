import java.util.Scanner;

class AreaOfCircle {
    double radius;

    AreaOfCircle(double radius){
        this.radius = radius;
    }
    public double Area(){
        return Math.PI*radius*radius;
    }
    public double Perimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "It is a Cicle\nTo Get its Area and Perimeter: \n"+"The Area is: "+Area()+"\n"+"And The Perimeter is: "+Perimeter()+"";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius Of The Circle: ");
        double n = sc.nextDouble();
        AreaOfCircle circle1 = new AreaOfCircle(n);
        System.out.println(circle1);
//        double Area = circle1.Area();
//        System.out.println("The Area of The Circle is: "+Area);
//        double Perimeter = circle1.Perimeter();
//        System.out.println("The Perimeter of The Circle is: "+Perimeter);

    }
}
