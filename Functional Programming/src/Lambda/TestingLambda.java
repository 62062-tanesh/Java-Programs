package Lambda;

public class TestingLambda {
    public static void main(String[] args) {
        System.out.println("Hello World");
        TestingLambda test = new TestingLambda();
        System.out.println(test.add(5,3));
        test.printString("Hii... This is Tanesh Raj Who are You");

    }

    public void printString(String toPrint){
        System.out.println(toPrint);
    }

    public int add(int a, int b){
        return a+b;
    }
}
