package SimpleApplication.geometry;

public class Rectangle {
    float length;
    float breadth;

    public Rectangle(float l, float b) {
        this.length = l;
        this.breadth =b;
    }
    public double AreaOfRectangle(){
        double area = length*breadth;
        return area;
    }
}
