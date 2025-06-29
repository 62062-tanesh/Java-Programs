import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int n2 = sc.nextInt();
        System.out.println(lcm(n1,n2));
    }
    public static int lcm(int n1, int n2){
        int i = 1;
        while(i <= n2){
            int fact = n1 * i;
            if(fact % n2 == 0){
                return fact;
            }
            i++;
        }
        return 0;
    }
}
