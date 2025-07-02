import java.util.Scanner;

class SumandAverageOf2DArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int [][] arr = SearchElementIn2DArray.Input2DArray();
        SearchElementIn2DArray.Display2DArray(arr);
        System.out.println("Sum of The Array is: "+sumOf2DArray(arr));
        System.out.println("The Average of The Array is: "+avg(arr));

    }
    public static int sumOf2DArray(int [][]a){
        int sum = 0;
        int i=0;
        while(i<a.length){
            int j=0;
            while(j<a[i].length){
                sum += a[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double avg(int [][]a){
        int add = sumOf2DArray(a);
        int mul = a.length*a[0].length;
        return add/(double)mul;
    }
}
