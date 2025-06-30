import java.util.Scanner;
class PatternPrint {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = sc.nextInt();
        RightHalfPyramid(n);
        ReverseRightHalfPyramid(n);
        LeftHalfPyramid(n);
    }
    public static void RightHalfPyramid(int n){
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void ReverseRightHalfPyramid(int n){
        int i = 1;
        while(i<=n){
            int j = n;
            while(j>=i){
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
    public static void LeftHalfPyramid(int n){
        int i = 1;
        while(i<=n){
            int j=n;
            while(j>i){
                System.out.print("  ");
                j--;
            }
            int k=1;
            while(k<=i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
