import java.util.Scanner;
class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
    public static long fact(int n){
        int i = 1;
        long fact = 1;
        if(n==0){
            return 1;
        }
        while(i<=n){
            fact *= i;
            i++;
        }
        return fact;
    }
}