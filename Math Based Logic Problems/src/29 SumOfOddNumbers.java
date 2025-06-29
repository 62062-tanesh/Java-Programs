import java.util.Scanner;
class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        System.out.println(sumOfOdd(n));
    }
    public static int sumOfOdd(int n){
        int i = 1;
        int sum = 0;
        while(i<=n){
            if(i%2 != 0){
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
