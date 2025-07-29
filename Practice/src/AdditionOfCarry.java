import java.util.Scanner;

public class AdditionOfCarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int carry = 0;
        int c = 0;
        while(n1>0 || n2>0){
            int r1 = n1%10;
            int r2 = n2%10;
            int sum = r1 + r2 + c;
            if(sum > 9){
                carry++;
                c = 1;
            }else{
                c = 0;
            }
            n1 = n1/10;
            n2 = n2/10;
        }
        System.out.println(carry);
    }
}
