import java.util.Scanner;

class OccuranceInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of The Array: ");
        int n = sc.nextInt();
        int [] a = new int [n];
        System.out.println("Enter The Elements of The Array");
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter The Element to Check The Occurance");
        int k = sc.nextInt();
        int count = Occurance(a,k);
        System.out.print("The Occurance of The Number is: "+count);
    }
    public static int Occurance(int [] a, int n){
        int count =0;
        for(int i : a){
            if(n == i){
                count ++;
            }
        }
        return count;
    }
}
