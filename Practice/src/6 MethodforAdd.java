import java.util.Scanner;

class MethodforAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int num2 = sc.nextInt();
        int result = sum(num1, num2);
        System.out.println("The Addition Of The Numbers are " + result);
    }
    public static int sum(int n1,int n2){
        System.out.println("First Number is: "+n1);
        System.out.println("Second Number is: "+n2);
        return n1 + n2;
    }
}
