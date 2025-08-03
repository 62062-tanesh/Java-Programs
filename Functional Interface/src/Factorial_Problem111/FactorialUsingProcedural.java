package Factorial_Problem111;

import java.util.Scanner;

public class FactorialUsingProcedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println(result);

    }
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
