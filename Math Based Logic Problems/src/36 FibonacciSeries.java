import java.util.Scanner;
class FabonnaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number to print The Fibonacci Series till The Number:");
        int n = sc.nextInt();
        fib(n);
    }
    public static void fib(int n){
        if(n<0) return;
        System.out.print("0 ");
        if(n == 0) return;
        System.out.print("1 ");
        int i = 0;
        int j = 1;
        while(i+j <= n){
                int k = i + j;
            System.out.print(k+" ");
            i = j;
            j = k;
        }
    }
}
