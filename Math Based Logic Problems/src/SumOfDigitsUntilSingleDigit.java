import java.util.Scanner;

public class SumOfDigitsUntilSingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        long n = sc.nextLong();
        long result = singleDigitSum(n);
        System.out.println("The Single Digit Sum of The Number is: "+result);
    }
    public static long DigitSum(long n){
        long sum = 0;
        while(n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    public static long singleDigitSum(long n){
        while(n>=10){
            n = DigitSum(n);
        }
        return n;
    }
}
