import java.util.Scanner;

class IsSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = ArrayUtility.ArrayIntput();
        ArrayUtility.Display(a);
        boolean inc = isIncreasing(a);
        boolean dec = isDecreasing(a);
        if(inc || dec){
            System.out.println("Array is Sorted.");
        }
        else{
            System.out.println("Array is not Sorted.");
        }
    }
    public static boolean isIncreasing(int [] a){
        int i = 1;
        while(i<a.length){
            if(a[i] < a[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int [] a){
        int i =1;
        while(i<a.length){
            if(a[i]>a[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
