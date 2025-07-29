import java.util.Scanner;

public class ReversingArrayAndUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of The Array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        int i = 0;
        while(i<n){
            arr[i] = sc.nextInt();
            i++;
        }

        ReverseArray(arr);

        for(int k=0; k<arr.length-1; k++){
            arr[k] = arr[k] + arr[k+1];
        }

        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }


    public static int [] ReverseArray(int [] a){
        int size = a.length;
        int i = 0;
        int j = size - 1;
        while(i<j){
            int temp  = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }
}
