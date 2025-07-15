import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isPrime(n);
        if(result){
            System.out.println("Number is Palindrome.");
        }
        else{
            System.out.println("Number is Not Palindrome:");
        }
    }
    public static boolean isPrime(int n){
        int num = 0;
        int org = n;
        while(n!=0){
            int r = n%10;
            num = num*10 +r;
            n = n/10;
        }
        if(org ==num){
            return true;
        }else{
            return false;
        }
    }
}
