import java.util.Scanner;
class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number to Check its Palindrome or Not.");
        int n = sc.nextInt();
        boolean result = palindrome(n);
        if(result){
            System.out.println("The Number is Palindrome.");
        }
        else{
            System.out.println("The Number is Not  Palindrome.");
        }
    }
    public static boolean palindrome(int n){
        int org = n;
        int sum = 0;
        while(n>0){
            sum = sum*10+(n%10);
            n /= 10;
        }
        if(sum == org) {
            return true;
        }
        else{
            return false;
        }
    }
}
