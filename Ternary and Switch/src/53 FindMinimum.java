import java.util.Scanner;

class FindMinimum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter The Second NUmber: ");
        int b = sc.nextInt();
        int result = findMin(a,b);
        System.out.println("The Min is: "+result);
    }
    public static int findMin(int a, int b){
        return a<b ? a:b;
//            if(a<b){
//                return a;
//            }
//            else{
//                return b;
//            }
    }
}
