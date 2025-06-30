import java.util.Scanner;
class SumAndAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = ArrayUtility.ArrayIntput();
//        TakeInput(arr);
//        Display(arr);
        ArrayUtility.Display(arr);
        System.out.println("The Sum of The Array is: "+sumOfArray(arr));
        System.out.println("The Average of The Array is: "+averageOfArray(arr));

    }
    /*public static void TakeInput(int [] n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Elements of The Array: ");
        int i=0;
        while(i<n.length){
            n[i] = sc.nextInt();
            i++;
        }
    }*/
    /*public static  void Display(int [] a){
        int size = a.length;
        int i=0;
        while (i<size){
            System.out.print(a[i]+" ");
            i++;
        }
        System.out.println();
    }*/
    public static long sumOfArray(int [] a){
        long sum = 0;
        int i=0;
        while(i<a.length){
            sum += a[i];
            i++;
        }
        return sum;
    }
    public static double averageOfArray(int [] a){
        return (double)sumOfArray(a)/a.length;
    }
}
