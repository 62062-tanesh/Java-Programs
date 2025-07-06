import java.util.Scanner;

class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of The Array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("\t\tEnter The Elements of The Array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int j : arr){
            if(max<j){
                max = j;
            }
        }
        System.out.println("The Max is: "+max);
    }
}
