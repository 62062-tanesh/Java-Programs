package Factorial_Problem111;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialUsingFunctional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IntStream.rangeClosed(2,n).reduce((a,b) -> a * b).ifPresent(System.out::println);
    }
}
