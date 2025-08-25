import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter The First Matrics");
        int [][] arr1 = Input2DArray();
        System.out.println("Enter The Second Matrics");
        int [][] arr2 = Input2DArray();
        Display2DArray(Multiplication(arr1, arr2));

    }
//    public static int sumOf2DArray(int [][]a){
//        int sum = 0;
//        int i=0;
//        while(i<a.length){
//            int j=0;
//            while(j<a[i].length){
//                sum += a[i][j];
//                j++;
//            }
//            i++;
//        }
//        return sum;
//    }
//    public static double avg(int [][]a){
//        int add = sumOf2DArray(a);
//        int mul = a.length*a[0].length;
//        return add/(double)mul;
//    }

    public static int[][] Input2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Rows: ");
        int row  =  sc.nextInt();
        System.out.print("Enter The column: ");
        int column = sc.nextInt();
        int [][]arr = new int [row][column];
        int  i =0;
        while(i<row){
            int j = 0;
            while(j<column){
                arr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        return arr;
    }

    public static void Display2DArray(int [][]a){
        int i=0;
        while(i<a.length){
            int j=0;
            while(j<a[i].length){
                System.out.print(a[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static int [][] Multiplication(int [][] a, int [][] b){
        int [][] ans = new int[a.length][a[0].length];
        int i = 0;
        while(i<a.length){
            int j=0;
            while(j<a[i].length){
                ans[i][j] = a[i][j] * b[i][j];
                j++;
            }
            i++;
        }
        return ans;
    }
}
