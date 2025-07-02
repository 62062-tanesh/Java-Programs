import java.util.Scanner;

class SumOfTwoDiagonalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = SearchElementIn2DArray.Input2DArray();
        SearchElementIn2DArray.Display2DArray(arr);
        long result = sumOfDiagonal(arr);
        System.out.println("The Sum Of The Two Diagonal Elements are: "+result);
    }
    public static long sumOfDiagonal(int [][]a){
        long ans = sumOfRightDiagonal(a) + sumofLeftDiagonal(a);
        if(a.length %2 != 0){
            int mid  = a.length/2;
            ans -= a[mid][mid];
        }
        return ans;
    }
    public static long sumOfRightDiagonal(int [][]a){
        long sum = 0;
        int i=0;
        while(i<a.length){
            int col = a.length-1-i;
            sum += a[i][col];
            i++;
        }
        return sum;
    }
    public static long sumofLeftDiagonal(int [][]a){
        long sum = 0;
        int i = 0;
        while(i<a.length){
            sum += a[i][i];
            i++;
        }
        return sum;
    }
}
