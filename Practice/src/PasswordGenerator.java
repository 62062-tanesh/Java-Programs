import java.util.Scanner;
/*Write program to generate the password which the sum of all possible palindrome numbers between given two numbers.
For Example:
Input: 10, 80
Output: 308*/
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int Password = 0;
        int i=n1;
        while(i<=n2){
            if(isPalindrome(i)){
                Password += i;
            }
            i++;
        }
        System.out.println(Password);
    }
    public static boolean isPalindrome(int n){
        int org = n;
        int sum = 0;
        while(n>0){
            sum = (sum*10) + (n%10);
            n = n/10;
        }
        if(sum == org){
            return true;
        }else{
            return false;
        }
    }
}
