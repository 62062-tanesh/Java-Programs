import java.util.Scanner;

public class Q18_LeapYearOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Year: ");
        int Year = sc.nextInt();
        if(Year%4 == 0 && Year % 100 != 0 || Year % 400 ==0){
            System.out.println(Year+" is Leap Year.");
        }
            else{
                System.out.println(Year+" is Not Leap Year.");
            }
    }
}
