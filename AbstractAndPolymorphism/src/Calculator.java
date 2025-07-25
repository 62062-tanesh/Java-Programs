public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public  double add(double a, double b){
        return a+b;
    }
}
class Test{
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        double result = c1.add(8.0,9.0);
        System.out.println(result);
    }
}
