import java.util.Scanner;

class TablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        table(n);
    }
    public static void table(int n){
        int i = 1;
        while(i<11){
            System.out.println(n+" x "+i+" = "+n*i);
            i++;
        }
    }
}
