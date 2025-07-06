import java.util.Scanner;

class BasicCalculatorr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t---------- Welcome To Basic Calculator -----------");
        System.out.println("Press 1 For Addition of Two Numbers.");
        System.out.println("Press 2 For Subtraction of Two Numbers.");
        System.out.println("tPress 3 For Multiplication of Two Numbers.");
        System.out.println("Press 4 For Division of A Number.");
        System.out.print("Press : ");
        int n = sc.nextInt();
        switch (n){
            case 1 : System.out.print("Enter The First Number: ");
                int a = sc.nextInt();
                System.out.print("Enter The Second Number: ");
                int b = sc.nextInt();
                System.out.println("The Addition is: "+(a+b));
                break;
            case 2 : System.out.print("Enter The First Number: ");
                int c = sc.nextInt();
                System.out.print("Enter The Second Number: ");
                int d = sc.nextInt();
                System.out.println("The Subtraction is: "+(c-d));
                break;
            case 3 : System.out.print("Enter The First Number: ");
                int e = sc.nextInt();
                System.out.print("Enter The Second Number: ");
                int f = sc.nextInt();
                System.out.println("The Multiplication is: "+(e*f));
                break;
            case 4 : System.out.print("Enter The Number: ");
                int g = sc.nextInt();
                System.out.print("Enter The Divisor: ");
                int h = sc.nextInt();
                System.out.println("The Division is: "+(g/h));
                break;
            default :
                System.out.println("Please Enter A Valid Option");
        }

    }

}
