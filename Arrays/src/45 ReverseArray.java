import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = ArrayUtility.ArrayIntput();
        ArrayUtility.Display(arr);
        rev(arr);
        System.out.println("Reversed Array");
        ArrayUtility.Display(arr);

    }
    public static int[] rev(int [] a){
        int  i = 0;
        int j = a.length-1;
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }
}
