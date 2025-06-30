import java.util.Scanner;
class ArmstrongNoCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = sc.nextInt();
        int result = armstrong(n);
        if(result == n){
            System.out.println("The Number is Armstrong.");
        }else{
            System.out.println("The Number is Not Armstrong.");
        }
    }
    public static int armstrong(int n){
        int sum = 0;
        int org = n;

        while(n>0){
            sum += 1;
            n= n/10;
        }
        int add = 0;
        while(org>0){
            int r = org%10;
            add += Math.pow(r,sum);
            org /= 10;
        }
        return add;
    }
}
