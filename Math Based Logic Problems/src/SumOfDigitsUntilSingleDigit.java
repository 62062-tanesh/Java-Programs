import java.util.Scanner;

public class SumOfDigitsUntilSingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        long n = sc.nextLong();
        long result = singleDigitSum(n);
        System.out.println("The Single Digit Sum of The Number is: "+result);
    }
    public static long singleDigitSum(long n){
        long sum = 0;
        while(n>0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println(sum);
        int sum1 = 0;
        if(sum > 9){
            while(sum > 0){
                sum1 += sum%10;
                sum = sum/10;
            }
        }else{
            return sum;
        }
        System.out.println(sum1);
        return sum1;
    }
}
