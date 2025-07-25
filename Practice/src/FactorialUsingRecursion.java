import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println(factorial);

    }
    public static int fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        else{
            return n*(fact(n-1));
        }
    }
}
