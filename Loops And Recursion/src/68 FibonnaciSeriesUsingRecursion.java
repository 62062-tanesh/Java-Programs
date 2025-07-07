import java.util.Scanner;

class FibonnaciSeriesUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number For Fibonacci Series: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(fib(i) + " ");
        }
    }
    public static int fib(int n){
        if(n==1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
