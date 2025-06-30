import java.util.Scanner;

public class ArrayUtility {
    public static int [] ArrayIntput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of The Array: ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.println("Enter The Elements of The Array: ");
        int i = 0;
        while(i<size){
//            System.out.print("Enter The "+(i+1)+" Element: ");
            arr[i] = sc.nextInt();
//            System.out.println();
            i++;
        }
        return arr;
    }
    public static void Display(int [] a){
        int i = 0;
        System.out.println("Elements of The Arrays are: ");
        while(i<a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        System.out.println();
    }
}
