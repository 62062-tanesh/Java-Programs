import java.util.Scanner;
class FindMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = ArrayUtility.ArrayIntput();
        ArrayUtility.Display(a);
        System.out.println("The Max Element of The Array is: "+max(a));
        System.out.println("The Min Element of The Array is: "+min(a));
    }
    public static int max(int []a){
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i<a.length){
            if(max<a[i]){
                max = a[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int []a){
        int min = Integer.MAX_VALUE;
        int i =0;
        while(i<a.length){
            if(min>a[i]){
                min = a[i];
            }
            i++;
        }
        return min;
    }

}
