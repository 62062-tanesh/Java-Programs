import java.util.Scanner;
class SumOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        System.out.println(Sod(n));
    }
    public static int Sod(int n){
        int sum =0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}
