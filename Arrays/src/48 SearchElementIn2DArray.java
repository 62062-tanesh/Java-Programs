import java.util.Scanner;
class SearchElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a = Input2DArray();
        Display2DArray(a);

        System.out.println("Enter The Number You want to search in the Array.");
        System.out.print("Enter Element: ");
        int n = sc.nextInt();
        boolean result = FindTheNumber(a,n);
        if(result){
            System.out.println("Element is Found.");
        }
        else{
            System.out.println("Element is Not Found.");
        }

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
    public static boolean FindTheNumber(int [][]a, int n){
        int i = 0;
        while(i<a.length){
            int j=0;
            while(j<a[i].length){
                if(a[i][j] == n){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
