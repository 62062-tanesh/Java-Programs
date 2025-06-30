import java.util.Scanner;

class NumberOfOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = ArrayUtility.ArrayIntput();
        ArrayUtility.Display(a);
        System.out.print("Enter The Number For Check The Occurrence: ");
        int n = sc.nextInt();
        int result = ocr(a,n);
        System.out.println("The Occurrence of "+n+" is: "+result);
    }
    public static int ocr(int [] a, int n){
        int ans = 0;
        int i = 0;
        while(i<a.length){
            if(n == a[i]){
                ans++;
            }
            i++;
        }
        return ans;
    }
}
