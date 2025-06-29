import java.util.Scanner;

public class Q12_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The Amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter The Time in Years: ");
        double T = sc.nextDouble();
        System.out.print("Enter The Rate you want to take: ");
        double R = sc.nextDouble();
        double SI = (P*R*T)/100;
        System.out.println("The Simple Interst is: "+SI);

    }
}
