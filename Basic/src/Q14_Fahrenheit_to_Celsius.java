import java.util.Scanner;

public class Q14_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Fahrenheit: ");
        float F = sc.nextFloat();
        float C = (F-32)*5/9;
        System.out.println("The Celsius is: "+C+"C");

    }
}
