import java.util.Scanner;

class SumofDigitUtilSingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = sum(n);
        System.out.println(result);
    }
    public static long sum(long n){
        while(n>10){
            long sum = 0;
            while(n >0){
                sum += n%10;
                n = n/10;
            }
            n = sum;
        }
        return n;
    }
}
