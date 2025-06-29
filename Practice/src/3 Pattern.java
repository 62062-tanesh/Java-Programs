import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        pyramidPattern(n);
    }
    public static void pyramidPattern(int n){
        int i = 0;
        while(i<n){
            System.out.print("*");
            int j=0;
            while(j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
