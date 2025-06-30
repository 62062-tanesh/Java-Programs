import java.util.Scanner;

class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = sc.nextInt();
        System.out.println("The Reverse of The Number is: "+reverse(n));
    }
    public static int reverse(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n /= 10;
        }
        return rev;
    }
}
