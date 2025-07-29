import java.util.Scanner;

public class varargs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Sum(5,4,7,5));
    }
    public static int Sum(int first, int second, int... n){
        int sum = 0;
        for (int i : n){
            sum += i;
        }
        return sum;
    }
}
