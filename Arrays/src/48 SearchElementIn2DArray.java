import java.util.Scanner;
class SearchElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Rows: ");
        int row  =  sc.nextInt();
        System.out.println("Enter The column: ");
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

    }
}
