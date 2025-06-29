import java.util.Scanner;
public class Q13_CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter The Time in Years: ");
        double T = sc.nextDouble();
        System.out.print("Enter The Rate you want to take: ");
        double R = sc.nextDouble();
        double CI = P*Math.pow((1+R/100),T);
        System.out.println("The Compound Interest is: "+CI);

    }
}
